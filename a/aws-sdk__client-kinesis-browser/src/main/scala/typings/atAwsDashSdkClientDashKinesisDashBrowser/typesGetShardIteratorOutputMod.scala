package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/types/GetShardIteratorOutput", JSImport.Namespace)
@js.native
object typesGetShardIteratorOutputMod extends js.Object {
  @js.native
  trait GetShardIteratorOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The position in the shard from which to start reading data records sequentially. A shard iterator specifies this position using the sequence number of a data record in a shard.</p>
      */
    var ShardIterator: js.UndefOr[String] = js.native
  }
  
}

