package typings.httpDashLinkDashDataloader

import typings.httpDashLinkDashDataloader.distSrcTypesMod.ClientOptions
import typings.httpDashLinkDashDataloader.distSrcTypesMod.Options
import typings.httpDashLinkDashDataloader.distSrcTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http-link-dataloader/dist/src/BatchedGraphQLClient", JSImport.Namespace)
@js.native
object distSrcBatchedGraphQLClientMod extends js.Object {
  @js.native
  class BatchedGraphQLClient protected () extends js.Object {
    def this(uri: String) = this()
    def this(uri: String, options: Options with ClientOptions) = this()
    var dataloader: js.Any = js.native
    var options: Options = js.native
    var uri: String = js.native
    def load(keys: js.Array[String]): js.Promise[_] = js.native
    def request[T /* <: js.Any */](query: String): js.Promise[T] = js.native
    def request[T /* <: js.Any */](query: String, variables: Variables): js.Promise[T] = js.native
    def request[T /* <: js.Any */](query: String, variables: Variables, operationName: String): js.Promise[T] = js.native
  }
  
}

