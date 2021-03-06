package typings.socketioDashJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object socketioDashJwtMod {
  import typings.std.Error

  type JwtAuthorizeCallback = js.Function0[Unit]
  type JwtSecretFunc = js.Function3[/* request */ js.Any, /* payload */ js.Any, /* callback */ JwtSecretFuncCallback, Unit]
  type JwtSecretFuncCallback = js.Function2[/* err */ Error | Null, /* secret */ String, Unit]
}
