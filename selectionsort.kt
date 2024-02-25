package sorts

fun main(){
    val arrays = arrayOf(67, 44, 82, 17, 20)
    val sizeofarray = arrays.size

    for( i in 0 .. sizeofarray){
        var imin = i
        for ( j in i+1 until sizeofarray ){
            if(arrays[j]<arrays[imin])
                imin = j
        }


        var temp : Int
        temp = arrays[i]
        arrays[i] = arrays[imin]
        arrays[imin] = temp
    }
    println(arrays.contentToString())
}
