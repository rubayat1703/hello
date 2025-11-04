package com.rubayat.hello

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rubayat.hello.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var nameAdapter: NameAdapter

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = listOf(
            Contact("Rubayat","+8801873938625",""),
            Contact("Razia Mannan", "+880130000002", "https://randomuser.me/api/portraits/women/2.jpg"),
            Contact("Arafat Hossain", "+880130000003", "https://randomuser.me/api/portraits/men/3.jpg"),
            Contact("Tasin Rahman", "+880130000004", "https://randomuser.me/api/portraits/men/4.jpg"),
            Contact("Nafisa Ahmed", "+880130000005", "https://randomuser.me/api/portraits/women/5.jpg"),
            Contact("Sakib Hasan", "+880130000006", "https://randomuser.me/api/portraits/men/6.jpg"),
            Contact("Sumaiya Noor", "+880130000007", "https://randomuser.me/api/portraits/women/7.jpg"),
            Contact("Arif Mahmud", "+880130000008", "https://randomuser.me/api/portraits/men/8.jpg"),
            Contact("Fahmida Akter", "+880130000009", "https://randomuser.me/api/portraits/women/9.jpg"),
            Contact("Tanvir Alam", "+880130000010", "https://randomuser.me/api/portraits/men/10.jpg"),
            Contact("Mim Akter", "+880130000011", "https://randomuser.me/api/portraits/women/11.jpg"),
            Contact("Shuvo Rahman", "+880130000012", "https://randomuser.me/api/portraits/men/12.jpg"),
            Contact("Tahsin Islam", "+880130000013", "https://randomuser.me/api/portraits/men/13.jpg"),
            Contact("Ruma Akhter", "+880130000014", "https://randomuser.me/api/portraits/women/14.jpg"),
            Contact("Rakibul Hasan", "+880130000015", "https://randomuser.me/api/portraits/men/15.jpg"),
            Contact("Sadia Hossain", "+880130000016", "https://randomuser.me/api/portraits/women/16.jpg"),
            Contact("Jahidul Islam", "+880130000017", "https://randomuser.me/api/portraits/men/17.jpg"),
            Contact("Tanjila Rahman", "+880130000018", "https://randomuser.me/api/portraits/women/18.jpg"),
            Contact("Nayeem Ahsan", "+880130000019", "https://randomuser.me/api/portraits/men/19.jpg"),
            Contact("Rita Khatun", "+880130000020", "https://randomuser.me/api/portraits/women/20.jpg"),
            Contact("Emon Chowdhury", "+880130000021", "https://randomuser.me/api/portraits/men/21.jpg"),
            Contact("Samira Islam", "+880130000022", "https://randomuser.me/api/portraits/women/22.jpg"),
            Contact("Faisal Mahmud", "+880130000023", "https://randomuser.me/api/portraits/men/23.jpg"),
            Contact("Nasrin Akter", "+880130000024", "https://randomuser.me/api/portraits/women/24.jpg"),
            Contact("Hasibul Haque", "+880130000025", "https://randomuser.me/api/portraits/men/25.jpg"),
            Contact("Nishat Tamanna", "+880130000026", "https://randomuser.me/api/portraits/women/26.jpg"),
            Contact("Rezaul Karim", "+880130000027", "https://randomuser.me/api/portraits/men/27.jpg"),
            Contact("Farhana Jahan", "+880130000028", "https://randomuser.me/api/portraits/women/28.jpg"),
            Contact("Shakil Ahmed", "+880130000029", "https://randomuser.me/api/portraits/men/29.jpg"),
            Contact("Proma Rahman", "+880130000030", "https://randomuser.me/api/portraits/women/30.jpg"),
            Contact("Maruf Islam", "+880130000031", "https://randomuser.me/api/portraits/men/31.jpg"),
            Contact("Rodela Hasan", "+880130000032", "https://randomuser.me/api/portraits/women/32.jpg"),
            Contact("Naim Chowdhury", "+880130000033", "https://randomuser.me/api/portraits/men/33.jpg"),
            Contact("Sinthiya Akter", "+880130000034", "https://randomuser.me/api/portraits/women/34.jpg"),
            Contact("Rahat Hossain", "+880130000035", "https://randomuser.me/api/portraits/men/35.jpg"),
            Contact("Tuli Akhter", "+880130000036", "https://randomuser.me/api/portraits/women/36.jpg"),
            Contact("Sabbir Rahman", "+880130000037", "https://randomuser.me/api/portraits/men/37.jpg"),
            Contact("Lamia Islam", "+880130000038", "https://randomuser.me/api/portraits/women/38.jpg"),
            Contact("Abir Hasan", "+880130000039", "https://randomuser.me/api/portraits/men/39.jpg"),
            Contact("Rima Chowdhury", "+880130000040", "https://randomuser.me/api/portraits/women/40.jpg"),
            Contact("Mizanur Rahman", "+880130000041", "https://randomuser.me/api/portraits/men/41.jpg"),
            Contact("Tasmia Noor", "+880130000042", "https://randomuser.me/api/portraits/women/42.jpg"),
            Contact("Imran Kabir", "+880130000043", "https://randomuser.me/api/portraits/men/43.jpg"),
            Contact("Rifat Akter", "+880130000044", "https://randomuser.me/api/portraits/women/44.jpg"),
            Contact("Asif Mahmud", "+880130000045", "https://randomuser.me/api/portraits/men/45.jpg"),
            Contact("Mahira Islam", "+880130000046", "https://randomuser.me/api/portraits/women/46.jpg"),
            Contact("Nashid Rahman", "+880130000047", "https://randomuser.me/api/portraits/men/47.jpg"),
            Contact("Puja Akter", "+880130000048", "https://randomuser.me/api/portraits/women/48.jpg"),
            Contact("Rasel Karim", "+880130000049", "https://randomuser.me/api/portraits/men/49.jpg")
        )

        nameAdapter = NameAdapter(user)
        binding.contactList.adapter = nameAdapter

    }
}