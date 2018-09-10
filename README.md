# 定期的技术总结记录

## 月总结 2018.8.13--2018.9.10 
* 数字钱包的私钥、公钥、地址、助记词的生成关系：随机词 → 生成秘钥对 → 公钥 → 地址 
* 开源的库要判断是否满足核心功能， _先仔细看清楚再去用_ ，否则后面的安装调试时间都是浪费
* 版本管理。新功能要单独切分支出来，测完之后再合并到可用的稳定分支。
* 手机系统对调试的影响。华为测试机，调试accessbility会被手机安全限制，导致没有log，换个手机就好了
* Accessbility读取屏幕上的控件、模拟点击的demo
* Dash的应用，code snippet系统搭建，提高效率
* 密码学

  `
  【hash】 
  散列。把任意尺寸的数据，转换为【固定尺寸】。
  特点：
  确定性：两个不同的hash，他们的原始数据肯定不同。（反之不一定成立，两个不同的文件有可能生成同一个hash，也就是碰撞）
  不可逆性。
  非对称加密：加密和解密用的不同的秘钥。RSA，ECC
  `
  
* commit规范
* debug卡死，no such host as localhost
* markdown格式记录学习，bear软件的使用
* 买的android安全方面的书，zip压缩漏洞，勒索软件的实现过程

