package kh.edu.rupp.fe.dse.theapplication.model

data class UserModel(
    val name:String? = null,
    val nameOfResturant:String? = null,
    val email:String? = null,
    val password:String? = null,
    val phone:String? = null,
    var address: String? = null
)
