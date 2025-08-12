package com.example.hireagent_ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HireAgentUI(){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Row (modifier = Modifier.fillMaxWidth().background(Brush.horizontalGradient(listOf(Color(0xFF3FF5EF9), Color(0xFF8A5CFF)))),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top){
            Icon(imageVector = Icons.Default.AccountBox, contentDescription = "",
                modifier = Modifier.size(48.dp)
            )
            Column {
                Text(text = "HireAgent", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)
                Text(text = "AI-Powered Hiring Assistant", fontSize = 16.sp, fontWeight = FontWeight.Normal, color = Color.White)            }
        }

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Top){
            Text(text = ".", fontSize = 64.sp, fontWeight = FontWeight.Bold, color = Color(0xff3f5ef9))
            Text(text = ".", fontSize = 64.sp, fontWeight = FontWeight.Bold, color = Color.Gray)
            Text(text = ".", fontSize = 64.sp, fontWeight = FontWeight.Bold, color = Color.Gray)
        }

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Top){
            Text(text = "Input", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color(0xFF87CEEB))
            Text(text = "Analysis", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Gray)
            Text(text = "Result", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Gray)
        }

            Card (
                modifier = Modifier.fillMaxWidth().padding(12.dp)
                    .border(width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(12.dp)),
                colors = CardDefaults.cardColors(Color.White),
                shape = RoundedCornerShape(12.dp)
            ){
                Row (modifier = Modifier,
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically)
                {
                    Icon(
                        imageVector = Icons.Outlined.Email, contentDescription = "",
                        modifier = Modifier.size(64.dp).padding(8.dp).background(Brush.horizontalGradient(listOf(Color(0xFF3FF5EF9), Color(0xFF8A5CFF)))),
                    )

                    Column(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                        Text(
                            text = "Resume upload",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Text(
                            text = "Upload 1-10 resumes for batch analysis",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Gray
                        )
                    }
                }
                Spacer(modifier = Modifier.height(4.dp))
                Card (
                    modifier = Modifier.fillMaxWidth().padding(12.dp)
                        .border(width = 2.dp,
                            color = Color.Black,
                            shape = RoundedCornerShape(12.dp)),
                    shape = RoundedCornerShape(12.dp),
                    //colors = CardDefaults.cardColors(Color.LightGray)
                ){
                    Column (modifier = Modifier.fillMaxWidth().padding(top = 8.dp, bottom = 8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center){
                        Icon(imageVector = Icons.Outlined.Email, contentDescription = "",
                            modifier = Modifier.size(48.dp),tint = Color(0xFF000080))
                        Text(text = "Select Resume Files", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color(0xFF000080))
                        Text(text = "PDF, DOCX, DOC, TXT . Max 10MB each", fontSize = 12.sp, fontWeight = FontWeight.Normal, color = Color.Gray)
                    }
                }
            }

        Card (
            modifier = Modifier.fillMaxWidth().padding(12.dp)
                .border(width = 2.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(12.dp)),
            colors = CardDefaults.cardColors(Color.White),
            shape = RoundedCornerShape(12.dp)
        ){
            Row (modifier = Modifier,
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically){
                Icon(
                    imageVector = Icons.Outlined.Email, contentDescription = "",
                    modifier = Modifier.size(64.dp).padding(8.dp).background(Brush.horizontalGradient(listOf(Color(0xFF3FF5EF9), Color(0xFF8A5CFF)))),
                )

                Column(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                    Text(
                        text = "Job Description",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    Text(
                        text = "Describe the role requirements and qualifications",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                }
            }
            Spacer(modifier = Modifier.height(4.dp))
            Card (
                modifier = Modifier.fillMaxWidth().padding(12.dp)
                    .border(width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(12.dp)),
                shape = RoundedCornerShape(12.dp),
                //colors = CardDefaults.cardColors(Color.LightGray)
            ) {
                TextField(value = "", onValueChange = {}, label = { Text("Job Description") },
                    placeholder = {"Job Description"}, modifier = Modifier.fillMaxSize(),singleLine = false,
                    )
            }

            Row(modifier = Modifier.fillMaxWidth().padding(8.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom) {
                Text(
                    text = "0/50+ chars",
                    fontSize = 10.sp,
                    modifier = Modifier.padding(8.dp),
                   // color = Color(0xFF7A7A7A)
                )
            }
        }
    }
}