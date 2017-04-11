package cn.hjie.ssm.main;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * User : Hong.jie
 * Date : 2017/4/11
 * Time : 15:45
 * Created with 集团三码项目组
 * Annotation : mybatis逆向工程的 生成程序
 *  官网有代码实例-- http://www.mybatis.org/generator/running/runningWithJava.html
 *
 *  用java程序生成的mapper.java、mapper.xml和po类等，需要拿到项目中验证才行。
 *  本例将用在项目【spring_mybatis】项目中进行测试。
 *
 */
public class GeneratorSqlMap {
    public void generator() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //复制官网代码，需要修改的地方就是这里指定生成的配置文件
        File configFile = new File("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }

    public static void main(String[] args) throws Exception {
        try {
            GeneratorSqlMap generatorSqlmap = new GeneratorSqlMap();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
