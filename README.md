#打包

##打包基座
1.将资源放到\src\main\assets\apps目录下

2. 修改\src\main\assets\data\dcloud_control.xml 中debug为true

3.从工具栏选择 build->build bundle/aps->build apks

##打包正式包
1.将资源放到\src\main\assets\apps目录下

2. 修改\src\main\assets\data\dcloud_control.xml 中debug为false

3.更新build.gradle中的版本号versionCode/versionName

4.从工具栏选择build->generate signed bundle/apks
									->apk
									->module选择你要打包的工程(terminal-by)，选择该工程下的jks,输入密码111111/111111，alias为key
									->输出目录folder选择你的工程(terminal-by),选择release，下面两个都勾上，finish
