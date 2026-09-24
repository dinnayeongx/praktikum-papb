package com.example.praktikum3_state_245150200111001_annisamaulidina

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum3_state_245150200111001_annisamaulidina.ui.theme.Praktikum3_State_245150200111001_AnnisaMaulidinaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //CounterApp()
//            Column(
//                horizontalAlignment = Alignment.CenterHorizontally,
//                modifier = Modifier.fillMaxSize().padding(16.dp),
//                verticalArrangement = Arrangement.Center
//            ) {
//                FollowApp()
//            }
//            ProfileCard()

            Praktikum3_State_245150200111001_AnnisaMaulidinaTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    //CounterPlusMinusApp()
                    //ToggleColorBox()
                    InteractiveProfileCard()
                }
            }
        }
    }
}

// TUGAS PRAKTIKUM
@Composable
fun CounterPlusMinusApp() {
    var count by remember { mutableStateOf(0) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Nilai Counter: $count", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            Button(onClick = { if (count > 0) count-- }) {
                Text("–")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { count++ }) {
                Text("+")
            }
        }
    }
}

@Composable
fun ToggleColorBox() {
    var isRed by remember { mutableStateOf(true) }

    Box(
        modifier = Modifier
            .size(200.dp)
            .background(if (isRed) Color.Red else Color.Green)
            .clickable { isRed = !isRed },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = if (isRed) "Merah" else "Hijau",
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun InteractiveProfileCard() {
    var isFollowed by remember { mutableStateOf(false) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(R.drawable.profil),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text("Oh Sehun", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text("EXO's Member", fontSize = 14.sp, color = Color.Gray)
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = { isFollowed = !isFollowed }) {
            Text(if (isFollowed) "Unfollow" else "Follow")
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = if (isFollowed) "Anda mengikuti akun ini" else "Anda belum mengikuti akun ini",
            fontSize = 12.sp
        )
    }
}

// LATIHAN PRAKTIKUM
//@Composable
//fun CounterApp() {
//    var count by remember { mutableStateOf(0) }
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier.fillMaxSize().padding(16.dp),
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text("Jumlah Klik: $count")
//        Spacer(modifier = Modifier.height(8.dp))
//        Button(onClick = { count++ }) {
//            Text("Tambah")
//        }
//    }
//}
//
//@Composable
//fun FollowButton(
//    isFollowed: Boolean,
//    onClick: () -> Unit
//) {
////    var isFollowed by remember { mutableStateOf(false) }
//    Button(onClick = onClick) {
//        Text(if (isFollowed) "Unfollow" else "Follow")
//    }
//}
//
//@Composable
//fun FollowApp() {
//    var isFollowed by remember { mutableStateOf(false) }
//    FollowButton(
//        isFollowed = isFollowed,
//        onClick = { isFollowed = !isFollowed }
//    )
//}
//
//@Composable
//fun ProfileCard() {
//    var isFollowed by remember { mutableStateOf(false) }
//
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center
//    ) {
//        Image(
//            painter = painterResource(R.drawable.profil),
//            contentDescription = "Foto Profil",
//            modifier = Modifier.size(120.dp).clip(CircleShape)
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//        Text("Nama: Andi", fontSize = 20.sp, fontWeight = FontWeight.Bold)
//        Spacer(modifier = Modifier.height(4.dp))
//        Text("Mahasiswa Teknik Informatika")
//        Spacer(modifier = Modifier.height(12.dp))
//        Button(onClick = { isFollowed = !isFollowed }) {
//            Text(if (isFollowed) "Unfollow" else "Follow")
//        }
//    }
//}