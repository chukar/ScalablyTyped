package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreExportJobsResponseMod._UnmarshalledExportJobsResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/GetSegmentExportJobsOutput", JSImport.Namespace)
@js.native
object typesGetSegmentExportJobsOutputMod extends js.Object {
  @js.native
  trait GetSegmentExportJobsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Export job list.
      */
    var ExportJobsResponse: _UnmarshalledExportJobsResponse = js.native
  }
  
}

