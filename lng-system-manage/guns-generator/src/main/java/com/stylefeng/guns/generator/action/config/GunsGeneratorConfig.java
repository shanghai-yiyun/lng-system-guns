package com.stylefeng.guns.generator.action.config;

import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 默认的代码生成的配置
 *
 * @author fengshuonan
 * @date 2017-10-28-下午8:27
 */
public class GunsGeneratorConfig extends AbstractGeneratorConfig {

    protected void globalConfig() {
        globalConfig.setOutputDir("D:\\ttt");//写自己项目的绝对路径,注意具体到java目录
        globalConfig.setFileOverride(true);
        globalConfig.setEnableCache(false);
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(true);
        globalConfig.setOpen(false);
        globalConfig.setAuthor("lng168");
    }

    protected void dataSourceConfig() {
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("lng168.Hw.3388");
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/lng168_system?characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8");
    }

    protected void strategyConfig() {
        strategyConfig.setTablePrefix(new String[]{"sys_"});// 此处可以修改为您的表前缀
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
    }

    protected void packageConfig() {
        packageConfig.setParent(null);
        packageConfig.setEntity("com.lng168.article.api.model");
        packageConfig.setMapper("com.lng168.article.common.persistence.dao");
        packageConfig.setXml("com.lng168.article.common.persistence.dao.mapping");
    }

    protected void contextConfig() {
        contextConfig.setProPackage("com.lng168.article.rest");
        contextConfig.setCoreBasePackage("com.stylefeng.guns.core");
        contextConfig.setBizChName("会员管理");
        contextConfig.setBizEnName("member");
        contextConfig.setModuleName("member");
        contextConfig.setProjectPath("D:\\ideaSpace\\guns\\guns-admin");//写自己项目的绝对路径
        contextConfig.setEntityName("Member");
        sqlConfig.setParentMenuName(null);//这里写已有菜单的名称,当做父节点

        /**
         * mybatis-plus 生成器开关
         */
        contextConfig.setEntitySwitch(true);
        contextConfig.setDaoSwitch(true);
        contextConfig.setServiceSwitch(true);

        /**
         * guns 生成器开关
         */
        contextConfig.setControllerSwitch(true);
        contextConfig.setIndexPageSwitch(true);
        contextConfig.setAddPageSwitch(true);
        contextConfig.setEditPageSwitch(true);
        contextConfig.setJsSwitch(true);
        contextConfig.setInfoJsSwitch(true);
        contextConfig.setSqlSwitch(true);
    }

    @Override
    protected void config() {
        globalConfig();
        dataSourceConfig();
        strategyConfig();
        packageConfig();
        contextConfig();
    }
}
