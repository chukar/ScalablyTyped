package typings.relayDashRuntime.libUtilRelayConcreteNodeMod

import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod._GraphQLTaggedNode
import typings.relayDashRuntime.libUtilNormalizationNodeMod.NormalizationOperation
import typings.relayDashRuntime.libUtilReaderNodeMod.ReaderFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcreteRequest
  extends GeneratedNode
     with _GraphQLTaggedNode {
   // 'Request';
  val fragment: ReaderFragment
  val kind: String
  val operation: NormalizationOperation
  val params: RequestParameters
}

object ConcreteRequest {
  @scala.inline
  def apply(
    fragment: ReaderFragment,
    kind: String,
    operation: NormalizationOperation,
    params: RequestParameters
  ): ConcreteRequest = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConcreteRequest]
  }
}

