# 定期的技术总结记录

## 月总结 2018.10.9--2018.11.5
* 修改包名流程
[AndroidStudio一步步教你修改项目包名（最详细，最易懂） - StarWithRainbow - CSDN博客](https://blog.csdn.net/qq_35270692/article/details/78336049)
* NDK，CMake配置
* Realm版本更新，Migration版本判断，自动更新测试
* 打磨代码生成工具，利用IDE的自动提示补全和Dash工具组合。
* IDE内部的插件，xml生成代码，Android Code Generator。内部代码生成插件，Exynap。[GitHub - jiang111/awesome-androidstudio-plugins: 收集Android studio 常用的插件](https://github.com/jiang111/awesome-androidstudio-plugins)
* 输入法弹出，重新调整布局，标题消失 android:windowSoftInputMode="adjustPan|adjustResize"
* 多语言支持。见Dash，P.language；列表的第一个不是选择的语言的第一个，需要手动来判断。
* startActivityForResult()，重写finish(),在finish之前setResult
* 数据库对象要统一处理，不能到处写。for循环里不能执行数据库对象的set操作，要在外面嵌套beginTransaction。
* 确定问题，需要去框架的官网看源码的用法实例。




## 月总结 2018.9.11--2018.10.9
常用模块
* SectionRecyclerView 带分区的RecyclerView https://github.com/luizgrp/SectionedRecyclerViewAdapter
* TabLayout+ViewPager+Fragment https://github.com/pan93529/Summay/tree/master/tab_fragment_viewpager
* 助记词点选模块 https://github.com/whilu/AndroidTagView
* recyclerview的数据更新问题。网络请求之后，在runOnUiThread里notifyDataSetChanged。
* if对比res里的string，注意要getstring得到具体的值
* 校验钱包二级密码 generateKeyPair(secondSecret);通过用户输入的密码，生成秘钥对，来判断输入的公钥与保存的公钥是否一致。
* app迭代问题。版本更替导致的bug。此类bug难以复测，不好改，所以版本升级一定要做到位，否则增加大量后期的维护工作。


## 月总结 2018.8.13--2018.9.10 
* 数字钱包的私钥、公钥、地址、助记词的生成关系：随机词 → 生成秘钥对 → 公钥 → 地址 
* 开源的库要判断是否满足核心功能， _先仔细看清楚再去用_ ，否则后面的安装调试时间都是浪费
* 版本管理。新功能要单独切分支出来，测完之后再合并到可用的稳定分支。
* 手机系统对调试的影响。华为测试机，调试accessbility会被手机安全限制，导致没有log，换个手机就好了
* Accessbility读取屏幕上的控件、模拟点击的demo https://github.com/pan93529/Summay/tree/master/testAutoClick02
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


