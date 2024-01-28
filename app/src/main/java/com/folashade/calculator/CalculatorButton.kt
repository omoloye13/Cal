package com.folashade.calculator

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick : () -> Unit
){
    Box(
        contentAalinment = Alignment.Center,
        modifier = modifier
            .clip(CircleShape)
            .clickable { onClick()}
            .then(modifier)
    ){
        Text(
            text = symbol,
            fontSize = 6.sp,
            color = Color.white
        )
    }

}