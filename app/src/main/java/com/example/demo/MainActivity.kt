package com.example.demo

import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * RadioButton 演示 Activity
 * 展示如何在 Android 中使用单选按钮
 * RadioButton 必须放在 RadioGroup 中才能实现单选功能
 */
class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 初始化组件
        radioGroup = findViewById(R.id.radioGroup)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        // 设置 RadioGroup 的选择监听器
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val result = when (checkedId) {
                R.id.radioButton1 -> "你选择了: 男生"
                R.id.radioButton2 -> "你选择了: 女生"
                else -> "请选择性别"
            }
            textView.text = result
        }

        // 设置按钮点击监听器
        button.setOnClickListener {
            // 获取选中的 RadioButton 的 ID
            val selectedId = radioGroup.checkedRadioButtonId

            if (selectedId == -1) {
                Toast.makeText(this, "请先选择一个选项", Toast.LENGTH_SHORT).show()
            } else {
                val selectedRadioButton = findViewById<android.widget.RadioButton>(selectedId)
                Toast.makeText(this, "你选择了: ${selectedRadioButton.text}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
