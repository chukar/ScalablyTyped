package typings.next

import typings.next.distNextDashServerLibUtilsMod.Send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Json[T] extends js.Object {
  /**
    * Send data `json` data in response
    */
  var json: Send[T]
  /**
    * Send data `any` data in response
    */
  var send: Send[T]
  def status(statusCode: Double): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.NextApiResponse<T> */ js.Object
}

object Anon_Json {
  @scala.inline
  def apply[T](
    json: T => Unit,
    send: T => Unit,
    status: Double => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.NextApiResponse<T> */ js.Object
  ): Anon_Json[T] = {
    val __obj = js.Dynamic.literal(json = js.Any.fromFunction1(json), send = js.Any.fromFunction1(send), status = js.Any.fromFunction1(status))
  
    __obj.asInstanceOf[Anon_Json[T]]
  }
}

