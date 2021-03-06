package typings.expressDashOpenapi.expressDashOpenapiMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationFunction
  extends RequestHandler[ParamsDictionary, js.Any, js.Any]
     with Operation {
  var apiDoc: js.UndefOr[typings.openapiDashTypes.openapiDashTypesMod.OpenAPI.Operation] = js.native
  /* InferMemberOverrides */
  override def apply(
    T0: /* req */ Request[ParamsDictionary, js.Any, js.Any],
    T1: /* res */ Response[js.Any],
    T2: /* next */ NextFunction
  ): js.Any = js.native
}

