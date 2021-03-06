package typings.builderDashUtilDashRuntime

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeBooleans.`false`
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.DELETE
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.GET
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.PUT
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.base64
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.hex
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.installerDotexe
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.latin1
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.packageDot7z
import typings.builderDashUtilDashRuntime.outProgressCallbackTransformMod.ProgressInfo
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.GithubOptions
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.PublishConfiguration
import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.URL
import typings.std.Error
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime", JSImport.Namespace)
@js.native
object builderDashUtilDashRuntimeMod extends js.Object {
  @js.native
  class CancellationError ()
    extends typings.builderDashUtilDashRuntime.outCancellationTokenMod.CancellationError
  
  @js.native
  class CancellationToken ()
    extends typings.builderDashUtilDashRuntime.outCancellationTokenMod.CancellationToken {
    def this(parent: typings.builderDashUtilDashRuntime.outCancellationTokenMod.CancellationToken) = this()
  }
  
  @js.native
  class DigestTransform protected ()
    extends typings.builderDashUtilDashRuntime.outHttpExecutorMod.DigestTransform {
    def this(expected: String) = this()
    def this(expected: String, algorithm: String) = this()
    def this(expected: String, algorithm: String, encoding: base64) = this()
    def this(expected: String, algorithm: String, encoding: hex) = this()
    def this(expected: String, algorithm: String, encoding: latin1) = this()
  }
  
  @js.native
  class HttpError protected ()
    extends typings.builderDashUtilDashRuntime.outHttpExecutorMod.HttpError {
    def this(statusCode: Double) = this()
    def this(statusCode: Double, message: String) = this()
    def this(statusCode: Double, message: String, description: js.Any) = this()
  }
  
  @js.native
  abstract class HttpExecutor[REQUEST] ()
    extends typings.builderDashUtilDashRuntime.outHttpExecutorMod.HttpExecutor[REQUEST]
  
  @js.native
  class ProgressCallbackTransform protected ()
    extends typings.builderDashUtilDashRuntime.outProgressCallbackTransformMod.ProgressCallbackTransform {
    def this(
      total: Double,
      cancellationToken: typings.builderDashUtilDashRuntime.outCancellationTokenMod.CancellationToken,
      onProgress: js.Function1[/* info */ ProgressInfo, _]
    ) = this()
  }
  
  @js.native
  class UUID protected ()
    extends typings.builderDashUtilDashRuntime.outUuidMod.UUID {
    def this(uuid: String) = this()
    def this(uuid: Buffer) = this()
  }
  
  @js.native
  class XElement protected ()
    extends typings.builderDashUtilDashRuntime.outXmlMod.XElement {
    def this(name: String) = this()
  }
  
  val CURRENT_APP_INSTALLER_FILE_NAME: installerDotexe = js.native
  val CURRENT_APP_PACKAGE_FILE_NAME: packageDot7z = js.native
  def asArray[T](): js.Array[T] = js.native
  def asArray[T](v: T): js.Array[T] = js.native
  def asArray[T](v: js.Array[T]): js.Array[T] = js.native
  def configureRequestOptions(options: RequestOptions): RequestOptions = js.native
  def configureRequestOptions(options: RequestOptions, token: String): RequestOptions = js.native
  def configureRequestOptionsFromUrl(url: String, options: RequestOptions): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_DELETE(options: RequestOptions, token: String, method: DELETE): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_DELETE(options: RequestOptions, token: Null, method: DELETE): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_GET(options: RequestOptions, token: String, method: GET): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_GET(options: RequestOptions, token: Null, method: GET): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_PUT(options: RequestOptions, token: String, method: PUT): RequestOptions = js.native
  @JSName("configureRequestOptions")
  def configureRequestOptions_PUT(options: RequestOptions, token: Null, method: PUT): RequestOptions = js.native
  def configureRequestUrl(url: URL, options: RequestOptions): Unit = js.native
  def createHttpError(response: IncomingMessage): typings.builderDashUtilDashRuntime.outHttpExecutorMod.HttpError = js.native
  def createHttpError(response: IncomingMessage, description: js.Any): typings.builderDashUtilDashRuntime.outHttpExecutorMod.HttpError = js.native
  def getS3LikeProviderBaseUrl(configuration: PublishConfiguration): String = js.native
  def githubUrl(options: GithubOptions): String = js.native
  def githubUrl(options: GithubOptions, defaultHost: String): String = js.native
  def newError(message: String, code: String): Error = js.native
  def parseDn(seq: String): Map[String, String] = js.native
  def parseJson(result: js.Promise[String | Null]): js.Promise[_] = js.native
  def parseXml(data: String): typings.builderDashUtilDashRuntime.outXmlMod.XElement = js.native
  def safeGetHeader(response: js.Any, headerKey: String): js.Any = js.native
  def safeStringifyJson(data: js.Any): String = js.native
  def safeStringifyJson(data: js.Any, skippedNames: Set[String]): String = js.native
  /* static members */
  @js.native
  object HttpExecutor extends js.Object {
    def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = js.native
  }
  
  /* static members */
  @js.native
  object UUID extends js.Object {
    val OID: Buffer = js.native
    def check(uuid: String): `false` | Anon_Format | Anon_FormatVariant = js.native
    def check(uuid: String, offset: Double): `false` | Anon_Format | Anon_FormatVariant = js.native
    def check(uuid: Buffer): `false` | Anon_Format | Anon_FormatVariant = js.native
    def check(uuid: Buffer, offset: Double): `false` | Anon_Format | Anon_FormatVariant = js.native
    def parse(input: String): Buffer = js.native
    def v5(name: String, namespace: Buffer): js.Any = js.native
    def v5(name: Buffer, namespace: Buffer): js.Any = js.native
  }
  
}

