package com.zzp.vuespringbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {

    @RequestMapping("/vueTest")
    public String vueTest(){
        return "helloVue";
    }

    @RequestMapping("/treeData")
    public String treeData(){
        return "[{\"parent\":\"#\",\"id\":\"2f519c2696fa407ba7e424873506ffae\",\"text\":\"党建要闻\",\"state\":{\"opened\":true}},{\"parent\":\"f94022809e8d481a91a652ceefac641a\",\"id\":\"1e35d952f70f4ceabfc97bead5cd8b2b\",\"text\":\"支部动态\"},{\"parent\":\"#\",\"id\":\"f94022809e8d481a91a652ceefac641a\",\"text\":\"党务公开\",\"state\":{\"opened\":true}},{\"parent\":\"f94022809e8d481a91a652ceefac641a\",\"id\":\"6a3afbc88f0d4b749877be1d3a72be04\",\"text\":\"党风廉政\"},{\"parent\":\"f94022809e8d481a91a652ceefac641a\",\"id\":\"17743928180840c4afb9ed29d19baeb8\",\"text\":\"成果展示\"},{\"parent\":\"#\",\"id\":\"f611a7d21cbe490094a29ea8b81cb49c\",\"text\":\"先进事迹\",\"state\":{\"opened\":true}},{\"parent\":\"#\",\"id\":\"2ca41112c26f4c55a6f6fb42202b9fe3\",\"text\":\"主题教育\",\"state\":{\"opened\":true}},{\"parent\":\"#\",\"id\":\"9fc7d6e77fd6460c9ba4f5c0e911146e\",\"text\":\"三会一课\",\"state\":{\"opened\":true}},{\"parent\":\"#\",\"id\":\"2dcda95b74344a0aa9adc49c90fc089d\",\"text\":\"两学一做\",\"state\":{\"opened\":true}},{\"parent\":\"#\",\"id\":\"f54353aea43a4199816499d2fe81c91f\",\"text\":\"知识库\",\"state\":{\"opened\":true}}]";
    }

    @RequestMapping("/newsData")
    public String newsData(){
        return "{\"id\":\"6e95faea884a426682f57c3b6edf23b3\",\"createBy\":{\"id\":\"1\",\"loginFlag\":\"1\",\"admin\":true,\"roleNames\":\"\"},\"createDate\":\"2019-08-27 15:38:08\",\"updateBy\":{\"id\":\"1\",\"loginFlag\":\"1\",\"admin\":true,\"roleNames\":\"\"},\"updateDate\":\"2019-08-27 15:38:08\",\"classes\":{\"id\":\"2f519c2696fa407ba7e424873506ffae\",\"name\":\"党建要闻\",\"sort\":30,\"hasChildren\":false,\"partyNewsList\":[],\"parentId\":\"0\"},\"title\":\"【图解】2019年上半年5次出访，习近平始终强调这件事\",\"content\":\"&lt;img id=&quot;{84FB3916-A80F-47ED-983F-5D2A3B68135B}&quot; align=&quot;center&quot; src=&quot;http://www.xinhuanet.com/world/2019-08/26/1210255777_15666965823661n.jpg&quot; style=&quot;border: 0px; margin: 10px 0px; max-width: 100%; color: rgb(64, 64, 64); font-family: &amp;quot;PingFang SC&amp;quot;, &amp;quot;Lantinghei SC&amp;quot;, &amp;quot;Helvetica Neue&amp;quot;, Helvetica, Arial, &amp;quot;Microsoft YaHei&amp;quot;, &aring;&frac34;&reg;&egrave;&frac12;&macr;&eacute;&rsaquo;&hellip;&eacute;&raquo;&lsquo;, STHeitiSC-Light, simsun, &aring;&reg;&lsaquo;&auml;&frac12;&ldquo;, &amp;quot;WenQuanYi Zen Hei&amp;quot;, &amp;quot;WenQuanYi Micro Hei&amp;quot;, sans-serif; font-size: 18px; text-align: center; height: auto !important;&quot;&gt;\",\"isPublish\":\"0\"}";
    }
}
