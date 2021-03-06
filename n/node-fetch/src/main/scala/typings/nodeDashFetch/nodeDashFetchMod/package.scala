package typings.nodeDashFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashFetchMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.NodeJS.ReadableStream
  import typings.node.urlMod.URLSearchParams
  import typings.std.ArrayBuffer
  import typings.std.ArrayBufferView

  type BlobPart = ArrayBuffer | ArrayBufferView | Blob | String
  type BodyInit = ArrayBuffer | ArrayBufferView | ReadableStream | String | URLSearchParams
  type HeaderInit = HeadersInit
  type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.nodeDashFetch.nodeDashFetchMod.URLLike
    - typings.nodeDashFetch.nodeDashFetchMod.Request
  */
  type RequestInfo = _RequestInfo | String
}
