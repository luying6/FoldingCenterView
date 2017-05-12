一个自带图片折叠动画的自定义view
=============
<p>先来看效果图！</p>
<img src="/gif/mygif.gif"/>
<p>同样的是一个自定义view，参考了谷歌大神的折叠门效果</p>
<p>主要原理通过ValueAnimator模拟图片速率变化，通过勾股定理得到图片坐标的变化速率，绘制出每一帧图片的坐标矩阵，最后使用canvas进行绘制</p>

<p>使用:</p>

<p>
1、在xml文件里面定义控件(不需要设置背景图，默认通过代码设置)</br>
2、代码里面初始化控件foldingCenterView.setBitmap(bitmap);</br>
3、在需要播放折叠效果的地方调用foldingCenterView.setFolds(foldingCenterView, 1000);</br>
第一个参数是当前view的实例，第二个是时间(毫秒)
</p>



