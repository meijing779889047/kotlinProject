#   Kotlin

###  1.参考链接：
[https://juejin.im/entry/592fa089b123db0064e7385d](https://juejin.im/entry/592fa089b123db0064e7385d)

[ http://blog.csdn.net/Xulei881/article/details/50778681]( http://blog.csdn.net/Xulei881/article/details/50778681)

[ http://www.cnblogs.com/duduhuo/p/6839990.html]( http://www.cnblogs.com/duduhuo/p/6839990.html)


### 2.Android  Studio如何配置Kotlin开发环境？

*  打开as的File----Settings——-Plugins----Browse  Repositiories

![](http://i.imgur.com/okH6QpR.png)

*  搜索Kotlin插件进行安装，安装成功后需要重启。


*  插件安装成功后，右键项目将可以创建Kotlin的类以及Activity

![](http://i.imgur.com/8NUEzpM.png)




![](http://i.imgur.com/iKHoc0S.png)



  
*  当我们在项目新建一个Kotlin类，将会提示


![](http://i.imgur.com/KJASNgD.png)


*   点击配置，就会弹出一个对话框 


![](http://i.imgur.com/k3MbpJS.png)


* 点击Ok，as将进行配置

  * 项目根目录下的build.gralde
		 
				// Top-level build file where you can add configuration options common to all sub-projects/modules.
				
				buildscript {
				    ext.kotlin_version = '1.1.3-2'
				    repositories {
				        jcenter()
				    }
				    dependencies {
				        classpath 'com.android.tools.build:gradle:2.2.3'
				        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
				
				        // NOTE: Do not place your application dependencies here; they belong
				        // in the individual module build.gradle files
				    }
				}
				
				allprojects {
				    repositories {
				        jcenter()
				    }
				}
				
				task clean(type: Delete) {
				    delete rootProject.buildDir
				}


  * app下的build.gradle

			 apply plugin: 'com.android.application'
			 apply plugin: 'kotlin-android'
			 
			android {
			    compileSdkVersion 25
			    buildToolsVersion "25.0.3"
			    defaultConfig {
			        applicationId "com.mj.kotlinproject"
			        minSdkVersion 15
			        targetSdkVersion 25
			        versionCode 1
			        versionName "1.0"
			        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
			    }
			    buildTypes {
			        release {
			            minifyEnabled false
			            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
			        }
			    }
			  
			}
			dependencies {
			    compile fileTree(dir: 'libs', include: ['*.jar'])
			    compile 'com.android.support:appcompat-v7:25.3.1'
			    compile "org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version"
			}
			repositories {
			    mavenCentral()
			}


  * kotlin的配置基本完成，可以进行Kotlin的android开发。

###  如何实现无需findByid而直接声明组件？

* 打开模块下的build.gradle文件，在apply plugin: 'kotlin-android'下面加入一行：apply plugin: 'kotlin-android-extensions'。这是一个Kotlin的扩展模块，可以让Activity自动关联xml布局中的View而不需要findViewById。

    详情请参考：http://kotlinlang.org/docs/tutorials/android-plugin.html


			apply plugin: 'com.android.application'
			apply plugin: 'kotlin-android'

			apply plugin: 'kotlin-android-extensions'



   
*  看代码实现
 
说明：需要导入包  import kotlinx.android.synthetic.main.activity_kotlin.*

![](http://i.imgur.com/OoOpZhJ.png)



###  如何将java代码转换为Kotlin代码？



   ![](http://i.imgur.com/DkYSiGa.png)



###  如何将java和kotlin分开，以便于维护和开发？
*  在main文件夹下新建一个Kotlin目录

![](http://i.imgur.com/h66MOfq.png)



*  在App的build.gradle下配置

			android {
			    // 建立一个与'src/main/java'同级的kotlin工作目录
			    sourceSets {
			        main.java.srcDirs += 'src/main/kotlin'
			    }
			}