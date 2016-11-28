/**
 * Create time
 */
package com.changyu.foryou.init;

import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;
import com.changyu.foryou.model.News;
import com.changyu.foryou.model.Sellers;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * &lt;p&gt;Title: ${type_name}&lt;/p&gt;
 * &lt;p&gt;Description: &lt;/p&gt;
 *
 * @author ZhangHao
 * @version 1.0.8
 */
@Component
public class AvSetUp implements InitializingBean {
    //启动 leancloud api
    @Override
    public void afterPropertiesSet() throws Exception {
        AVObject.registerSubclass(Sellers.class);
        AVObject.registerSubclass(News.class);
        AVOSCloud.initialize("zaeoJsvpr1Do7ufp9D8Ci0BH-gzGzoHsz", "dSM3xn9gnWi0rO02XzNsRVSe", "z0zHlnD9RtPdN1Q7dMi2kISy");
    }
}
