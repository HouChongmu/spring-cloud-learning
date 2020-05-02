import com.yolyn.springcloud.PaymentMainBoot;
import com.yolyn.springcloud.entities.Payment;
import com.yolyn.springcloud.service.IPaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/2 21:46
 * @project springcloud-2020
 */
//测试开始时自动创建spring上下文
@RunWith(SpringJUnit4ClassRunner.class)
//加载配置
@ContextConfiguration(classes = PaymentMainBoot.class)
public class SpringbootTest {
    @Autowired
    private IPaymentService paymentService;
    @Test
    public void test(){
        Payment payment=paymentService.getPaymentById(123L);
        System.out.println(payment);
    }
}
