package com.example.campusconnect_aiactr.Activitys

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.campusconnect_aiactr.R

class PdfViewerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_viewer)

        val pdfWebView: WebView = findViewById(R.id.pdfWebView)

        requestInternetPermission()

        val webSettings: WebSettings = pdfWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.builtInZoomControls = true

        pdfWebView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                // Page finished loading, handle any necessary tasks here
            }
        }

        val pdfUrl = intent.getStringExtra("pdfUrl")
        pdfUrl?.let {
            pdfWebView.loadUrl(pdfUrl)
           }

    }

    private fun requestInternetPermission() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.INTERNET
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.INTERNET),
                10
            )
        }
    }
}