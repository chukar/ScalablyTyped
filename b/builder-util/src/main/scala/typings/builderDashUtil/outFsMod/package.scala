package typings.builderDashUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outFsMod {
  import typings.fsDashExtra.fsDashExtraMod.Stats
  import typings.node.Buffer

  type AfterCopyFileTransformer = js.Function1[/* file */ String, js.Promise[Unit]]
  type FileTransformer = js.Function1[
    /* file */ String, 
    (js.Promise[Null | String | Buffer | CopyFileTransformer]) | Null | String | Buffer | CopyFileTransformer
  ]
  type Filter = js.Function2[/* file */ String, /* stat */ Stats, Boolean]
}
