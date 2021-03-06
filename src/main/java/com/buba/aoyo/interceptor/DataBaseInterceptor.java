package com.buba.aoyo.interceptor;


import com.buba.aoyo.response.BaseResponse;
import com.buba.aoyo.service.CommonService;
import com.buba.aoyo.service.UserService;
import com.buba.aoyo.utils.StatusCode;
import com.sun.istack.internal.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * 定义拦截器
 */
@Component
public class DataBaseInterceptor implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(DataBaseInterceptor.class);

    @Autowired
    private CommonService commonService;

    @Autowired
    private UserService UserService;

    //获取前端塞在请求头header里面的accessToken字段的值，然后进行验证与解析
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(handler instanceof HandlerMethod){//判断类型

            //在请求头中取出accessToken
            String accessToken = request.getHeader("Ltoken");

            if(StringUtils.isBlank(accessToken)){
                BaseResponse baseResponse = new BaseResponse(StatusCode.AccessTokenNotExist,
                        "用户身份验证失败，请重新登录后再试。");
                System.out.println("用户身份验证失败，请重新登录后再试。");
                //相应信息
                commonService.print(response,baseResponse);
            }else {
//                验证token
                BaseResponse result = UserService.validateToken(accessToken);
                if(Objects.equals(result.getCode(),StatusCode.Success.getCode())){
                    return true;
                }else{
                    commonService.print(response,result);
                    return false;
                }

            }

        }

        return false;
    }

    @Override
    public void postHandle
            (HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        if (response.getStatus()==500){
            modelAndView.setViewName("/error/500");
        }else if (response.getStatus()==404){
            modelAndView.setViewName("/error/404");
        }
    }
    /**
     * 该方法也是需要当前对应的Interceptor的preHandle方法的返回值为true时才会执行。该方法将在整个请求完成之后，也就是DispatcherServlet渲染了视图执行，
     * 这个方法的主要作用是用于清理资源的，当然这个方法也只能在当前这个Interceptor的preHandle方法的返回值为true时才会执行。
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
