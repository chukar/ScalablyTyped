package typings.expressDashFrappe.distExpressDashFrappeMod

import typings.cors.corsMod.CorsOptions
import typings.express.expressMod.ErrorRequestHandler
import typings.express.expressMod.RequestHandler
import typings.expressDashFrappe.Anon_Json
import typings.expressDashFrappe.Anon_Options
import typings.expressDashRouters.distExpressDashRoutersMod.RouteConfig
import typings.expressDashRouters.distExpressDashRoutersMod.RouteConfigAlternative
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressFrappeConfig extends js.Object {
  var bodyParser: js.UndefOr[Boolean | Anon_Json] = js.undefined
  var cors: js.UndefOr[Boolean | CorsOptions] = js.undefined
  var errorHandler: js.UndefOr[ErrorRequestHandler[ParamsDictionary]] = js.undefined
  var io: js.UndefOr[ExpressFrappeSocketIOConfig] = js.undefined
  var middleware: js.UndefOr[js.Array[RequestHandler[ParamsDictionary]]] = js.undefined
  var morgan: js.UndefOr[Boolean] = js.undefined
  var routes: js.UndefOr[js.Array[RouteConfig] | RouteConfigAlternative] = js.undefined
  var static: js.UndefOr[String | Anon_Options] = js.undefined
}

object ExpressFrappeConfig {
  @scala.inline
  def apply(
    bodyParser: Boolean | Anon_Json = null,
    cors: Boolean | CorsOptions = null,
    errorHandler: (/* err */ js.Any, /* req */ Request[ParamsDictionary, js.Any, js.Any], /* res */ Response[js.Any], /* next */ NextFunction) => js.Any = null,
    io: ExpressFrappeSocketIOConfig = null,
    middleware: js.Array[RequestHandler[ParamsDictionary]] = null,
    morgan: js.UndefOr[Boolean] = js.undefined,
    routes: js.Array[RouteConfig] | RouteConfigAlternative = null,
    static: String | Anon_Options = null
  ): ExpressFrappeConfig = {
    val __obj = js.Dynamic.literal()
    if (bodyParser != null) __obj.updateDynamic("bodyParser")(bodyParser.asInstanceOf[js.Any])
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction4(errorHandler))
    if (io != null) __obj.updateDynamic("io")(io.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (!js.isUndefined(morgan)) __obj.updateDynamic("morgan")(morgan.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressFrappeConfig]
  }
}

