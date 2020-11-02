package com.buba.aoyo.config;


import java.util.ArrayList;
import java.util.List;

public class TreeNodeBuilder {
    /**
     * 把没有层级关系的集合变成有层级关系的
     */
    public static List<TreeJson> build(List<TreeJson> treeNodes,Integer topPid){
        List<TreeJson> nodes=new ArrayList<>();
        for (TreeJson n1 : treeNodes) {
            if(n1.getAppClassPid()==topPid) {
                nodes.add(n1);
            }
            for (TreeJson n2 : treeNodes) {
                if(n1.getAppClassId()==n2.getAppClassPid()) {
                    n1.getChildren().add(n2);
                }
            }
        }
        return nodes;
    }
}
