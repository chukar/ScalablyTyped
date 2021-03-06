package typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod

import typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusObject extends js.Object {
  var code: Status
  var details: String
  var metadata: Metadata
}

object StatusObject {
  @scala.inline
  def apply(code: Status, details: String, metadata: Metadata): StatusObject = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatusObject]
  }
}

