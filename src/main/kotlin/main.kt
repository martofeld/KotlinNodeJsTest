import NodeJS.ErrnoException
import com.mfeldsztejn.kjs.express.express
import com.mfeldsztejn.kjs.express.Router
import com.mfeldsztejn.kjs.express.get
import com.mfeldsztejn.kjs.express.internal.*
import com.mfeldsztejn.kjs.googleapis.auth.GenerateAuthUrlOpts
import com.mfeldsztejn.kjs.googleapis.auth.GoogleAuth
import com.mfeldsztejn.kjs.googleapis.auth.OAuth2Client
import com.mfeldsztejn.kjs.googleapis.sheets.Options
import com.mfeldsztejn.kjs.googleapis.sheets.auth
import com.mfeldsztejn.kjs.googleapis.sheets.sheets
import fs.readFile
import kotlin.js.Promise

fun main() {
    println(greeting("TestingKotlinNode"))

//    val express: dynamic = require("express")
//    val app = express() as Express
    val app = express()
    app.get("/asd") { req, res, next ->

    }
    /*app.use(RequestHandler { req, res, next ->
        println("Incoming message ${req.url}")
        next()
    })*/

    /*app.get("/ping", RequestHandler { req, res, next ->
        res.status(200).send("Pong")
    })*/

    app.get("/pingo", ::handler)

    app.get("/pinge") { req, res, _ ->
        res.status(200).send("asdfsadf")
    }

    val router2 = Router()
    router2.get("/test2") { req, res, next ->
        authorize()
        res.status(200).send("Whatever")
        /*sheets(object: Options {
            override var version = "v4"
            override var auth: dynamic
                get() =
        })*/
    }

    app.use("/base2", router2)
    app.get("/testing") { req, res, next ->
        println(req.query["value"])
        val query: dynamic = req.query
        val params: dynamic = req.params
        println(query.value)
        println(params)
        res.status(200).send("success ${query} - ${params}")
    }
    app.listen(3000) {
        println("Listening on port 3000")
    }
}

fun handler(req: Request__0, res: Response__0, next: NextFunction) {
    res.status(200).send("Pong")
}

fun authorize()/*: Promise<GoogleAuth>*/ {
    Promise<String> { resolve, reject ->
        fs.readFile("../../../../src/main/resources/credentials.json") { err, data ->
            if(err != null) reject(err)
            else resolve(data.toString("utf-8"))
        }
    }.then {
        println(it)
        val credentials = JSON.parse<Credentials>(it).installed
        println(credentials.client_secret)
        println(credentials.client_id)
        println(credentials.redirect_uris)
    }
//    (fs.readFile("../../../../src/main/resources/credentials.json") as Promise<Buffer>)
    /*fs.readFile("../../../../src/main/resources/credentials.json") { err, data ->
        if (err != null)
        println(err)
        println(data)
    }*/
    /*OAuth2Client(clientId = "", clientSecret = "", redirectUri = "").apply {
        val authUrl = generateAuthUrl(object: GenerateAuthUrlOpts{
            override var access_type: String? = "offline"
            override var scope = listOf("https://www.googleapis.com/auth/spreadsheets", "https://www.googleapis.com/auth/gmail.compose")
        })
    }*/
}

data class Installed(
    val client_secret: String,
    val client_id: String,
    val redirect_uris: List<String>
)

data class Credentials(
    val installed: Installed
)
/*fun core.Express.get(path: String, handler: RequestHandler__Func) {
    get(path, handler as Any)
}*/

/*fun ((Any, Any) -> Unit).toCallback() = Promise { resolve, reject ->
    this.invoke()
}*/

fun greeting(name: String) =
    "Hello, $name"