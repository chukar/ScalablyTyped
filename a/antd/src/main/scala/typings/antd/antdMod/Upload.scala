package typings.antd.antdMod

import org.scalablytyped.runtime.Instantiable0
import typings.antd.Anon_Accept
import typings.antd.Anon_FileList
import typings.antd.libUploadInterfaceMod.UploadProps
import typings.antd.libUploadMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Upload")
@js.native
class Upload protected () extends default {
  def this(props: UploadProps) = this()
}

/* static members */
@JSImport("antd", "Upload")
@js.native
object Upload extends js.Object {
  var Dragger: Instantiable0[typings.antd.libUploadDraggerMod.default] = js.native
  var defaultProps: Anon_Accept = js.native
  def getDerivedStateFromProps(nextProps: UploadProps): Anon_FileList | Null = js.native
}

