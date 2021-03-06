package typings.atAwsDashSdkClientDashDynamodbDashNode

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreTimeToLiveDescriptionMod._UnmarshalledTimeToLiveDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/DescribeTimeToLiveOutput", JSImport.Namespace)
@js.native
object typesDescribeTimeToLiveOutputMod extends js.Object {
  @js.native
  trait DescribeTimeToLiveOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p/>
      */
    var TimeToLiveDescription: js.UndefOr[_UnmarshalledTimeToLiveDescription] = js.native
  }
  
}

