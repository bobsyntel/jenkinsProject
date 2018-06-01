import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Main {
    @RequestMapping
    @ResponseBody
    String main(){
        return "Hello , WORLD!";
    }
    public static  void main(String[] args){
        System.out.println("Test");
        SpringApplication.run(Main.class,args);
    }
}
