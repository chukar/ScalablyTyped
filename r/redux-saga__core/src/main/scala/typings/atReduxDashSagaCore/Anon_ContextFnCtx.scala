package typings.atReduxDashSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextFnCtx[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in Name ]: (this : Ctx, args : ...any): void}
  */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.Anon_ContextFnCtx with js.Any */, Name /* <: String */] extends js.Object {
  var context: Ctx
  var fn: Name
}

object Anon_ContextFnCtx {
  @scala.inline
  def apply[Ctx /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in Name ]: (this : Ctx, args : ...any): void}
    */ typings.atReduxDashSagaCore.atReduxDashSagaCoreStrings.Anon_ContextFnCtx with js.Any */, Name /* <: String */](context: Ctx, fn: Name): Anon_ContextFnCtx[Ctx, Name] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContextFnCtx[Ctx, Name]]
  }
}

