package cn.limbo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by limbo on 2016/11/8.
 */
@Entity(name = "user")
@Table(name = "user")
public class User implements Serializable {

    private Integer userId;
    private String userName;
    private Integer userAge;
    private String userAddress;


    public User() {
    }

    public User(String userName, Integer userAge, String userAddress) {
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
    }
    
    //注解建议加在get上
    //原因： 使用Annotations形式的配置方式，默认的访问形式由@Id标记放置的位置决定，
    //当@Id标记在属性上声明，而不是在getter方法上，则所有的其它属性默认采用属性访问形式（即不通过getter和setter方法，直接访问属性）
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "user_name", nullable = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "user_age", nullable = false)
    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Column(name = "user_address", nullable = false)
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }
}
