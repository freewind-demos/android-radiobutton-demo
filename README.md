# android-radiobutton-demo

## 简介

演示 RadioButton 单选按钮组件的使用，实现单选功能。

## 基本原理

- RadioButton 必须放在 RadioGroup 中才能实现单选
- RadioGroup 内部只能有一个 RadioButton 被选中
- 通过 `checkedRadioButtonId` 获取选中的按钮 ID

## 启动和使用

### 环境要求
- Android Studio 4.0+
- JDK 11+

### 安装和运行
1. 用 Android Studio 打开此项目
2. 选择一个选项
3. 点击按钮确认选择

## 教程

### RadioButton 基础

```xml
<RadioGroup
    android:id="@+id/radioGroup"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content">

    <RadioButton
        android:id="@+id/radioButton1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="选项一" />

    <RadioButton
        android:id="@+id/radioButton2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="选项二" />

</RadioGroup>
```

### 获取选中项

```kotlin
val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)

// 获取选中的 RadioButton ID
val selectedId = radioGroup.checkedRadioButtonId

// 获取选中的按钮
val selectedButton = findViewById<RadioButton>(selectedId)
val text = selectedButton.text
```

### RadioGroup 监听器

```kotlin
radioGroup.setOnCheckedChangeListener { _, checkedId ->
    // checkedId 是当前选中的 RadioButton ID
}
```

### 注意事项

- RadioButton 必须放在 RadioGroup 中
- RadioGroup 可以设置默认选中项
- RadioGroup 只能选中一个选项
