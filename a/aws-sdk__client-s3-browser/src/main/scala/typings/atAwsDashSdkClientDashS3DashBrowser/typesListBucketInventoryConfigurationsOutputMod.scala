package typings.atAwsDashSdkClientDashS3DashBrowser

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInventoryConfigurationMod._UnmarshalledInventoryConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/ListBucketInventoryConfigurationsOutput", JSImport.Namespace)
@js.native
object typesListBucketInventoryConfigurationsOutputMod extends js.Object {
  @js.native
  trait ListBucketInventoryConfigurationsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>If sent in the request, the marker that is used as a starting point for this inventory configuration list response.</p>
      */
    var ContinuationToken: js.UndefOr[String] = js.native
    /**
      * <p>The list of inventory configurations for a bucket.</p>
      */
    var InventoryConfigurationList: js.UndefOr[js.Array[_UnmarshalledInventoryConfiguration]] = js.native
    /**
      * <p>Indicates whether the returned list of inventory configurations is truncated in this response. A value of true indicates that the list is truncated.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.native
    /**
      * <p>The marker used to continue this inventory configuration listing. Use the NextContinuationToken from this response to continue the listing in a subsequent request. The continuation token is an opaque value that Amazon S3 understands.</p>
      */
    var NextContinuationToken: js.UndefOr[String] = js.native
  }
  
}

