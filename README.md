# NumberPicker
## 说明
我们都使用过原生的NumberPicker，可以说很好用，但是可设置的属性太少，这个NumberPicker使用方式和原生NumberPicker类似，在此基础上加了很多可设置属性。
## 效果图

<img width="270" height="480" src="https://github.com/shouzhong/NumberPicker/blob/master/Screenshots/1.jpg"/>

## 使用
### 依赖
```
implementation 'com.shouzhong:NumberPicker:1.0.1'
```
### 代码
```
<com.shouzhong.numberpicker.NumberPicker
    android:layout_width="100dp"
    android:layout_height="200dp"
    app:npDividerColor="#999999"
    app:npDividerDistance="40dp"
    app:npDividerThickness="1dp"
    app:npTextColor="#333333"
    app:npSelectedTextColor="#333333"
    app:npTextSize="20sp"
    app:npSelectedTextSize="20sp"
    app:npMin="1"
    app:npMax="59"
    app:npFormatter="%02d"
    app:npWheelItemCount="5"
    app:npOrientation="vertical" />
```
## 说明
### xml
属性 | 说明
------------ | -------------
npDivider | 分割线背景
npDividerColor | 分割线颜色
npDividerDistance | 分割线间距
npDividerThickness | 分割线厚度
npSelectedTextAlign | 选中的文本位置，默认中间</br>selectedTextAlignRight：右边</br>selectedTextAlignCenter：中间</br>selectedTextAlignLeft：左边
npSelectedTextColor | 选中的文本颜色
npSelectedTextSize | 选中的文本大小
npSelectedTextStrikeThru | 选中文本是否加删除线
npSelectedTextUnderline | 选中文本是否加下划线
npTextAlign | 文本位置，默认中间</br>textAlignRight：右边</br>textAlignCenter：中间</br>textAlignLeft：左边
npTextColor| 文本颜色
npTextSize | 文本大小
npTextStrikeThru | 文本是否加删除线
npTextUnderline | 文本是否加下划线
npTypeface | 字体
npWheelItemCount | 显示的item数
npWrapSelectorWheel | 是否环绕显示
npOrientation | 滚动方向，默认竖直</br>horizontal：水平</br>vertical：竖直
npOrder | 数据排序方式，默认正序</br>ascending：正序</br>descending：倒序
npMax | 最大值
npMin | 最小值
npValue | 当前值
npFadingEdgeEnabled | 文本中间向两边是否逐渐变淡
npFadingEdgeStrength | 变淡强度0~1f
npFormatter | 文本格式化,只对数字有效，类似String.format
npHideWheelUntilFocused | 是否直到聚焦是才显示
npLineSpacingMultiplier | 文本行距系数，计算方式，默认行距*系数
npScrollerEnabled | 是否可以滑动
npMaxFlingVelocityCoefficient | 最大滑动速度系数，越小越快

### java
设置自定义字符串setDisplayedValues，配合setMinValue和setMaxValue使用，不然可能会脚标越界

方法名 | 说明
------------ | -------------
setDividerColor | 分割线颜色
setDividerColorResource | 分割线颜色
setDividerDistance | 分割线间距
setDividerDistanceResource | 分割线间距
setDividerThickness | 分割线厚度
setDividerThicknessResource | 分割线厚度
setSelectedTextAlign | 选中的文本位置</br>RIGHT：右边</br>CENTER：中间</br>LEFT：左边
setSelectedTextColor | 选中的文本颜色
setSelectedTextColorResource | 选中的文本颜色
setSelectedTextSize | 选中的文本大小
setSelectedTextSizeResource | 选中的文本大小
setSelectedTextStrikeThru | 选中文本是否加删除线
setSelectedTextUnderline | 选中文本是否加下划线
setTextAlign | 文本位置</br>RIGHT：右边</br>CENTER：中间</br>LEFT：左边
setTextColor | 文本颜色
setTextColorResource | 文本颜色
setTextSize | 文本大小
setTextSizeResource | 文本大小
setTextStrikeThru | 文本是否加删除线
setTextUnderline | 文本是否加下划线
setTypeface | 字体
setWheelItemCount | 显示的item数
setWrapSelectorWheel | 是否环绕显示
setOrientation | 滚动方向</br>HORIZONTAL：水平</br>VERTICAL：竖直
setOrder | 数据排序方式</br>ASCENDING：正序</br>DESCENDING：倒序
setMaxValue | 最大值
setMinValue | 最小值
setDisplayedValues | 自定义字符串
setValue | 当前选中的值
setFadingEdgeEnabled | 文本中间向两边是否逐渐变淡
setFadingEdgeStrength | 变淡强度0~1f
setFormatter | 设置文本格式化，只对数字有效
setLineSpacingMultiplier | 文本行距系数，计算方式，默认行距*系数
setScrollerEnabled | 是否可以滑动
setMaxFlingVelocityCoefficient | 最大滑动速度系数，越小越快
setOnValueChangedListener | 值变化监听
setOnClickListener | 选中框点击监听
setOnScrollListener | 滑动监听