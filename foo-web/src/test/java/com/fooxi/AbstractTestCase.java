package com.fooxi;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * Created by di on 13/12/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:spring/root-context.xml",
        "classpath*:spring/servlet-config.xml"
})
@TransactionConfiguration(defaultRollback = true)
public class AbstractTestCase {
}
