package com.example.digidoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    lateinit var webview: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        window.statusBarColor =ContextCompat.getColor(this,R.color.statusbarcolor)
        window.navigationBarColor = ContextCompat.getColor(this,R.color.white)

        //hooks
        webview = findViewById(R.id.webviewelement)
        webview.webViewClient = WebViewClient()
        webview.settings.javaScriptEnabled = true
        webview.loadUrl("https://digidoc.xyz/")
    }

    // if you press Back button this code will work
    override fun onBackPressed() {
        // if your webview can go back it will go back
        if (webview.canGoBack())
            webview.goBack()
        // if your webview cannot go back
        // it will exit the application
        else
            super.onBackPressed()
    }
}