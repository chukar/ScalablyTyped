package typings.next.distNextDashServerServerNextDashServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.next.Anon_AmpBindInitData
import typings.next.Anon_Amphtml
import typings.next.Anon_CatchAllRoute
import typings.next.Anon_False
import typings.next.Anon_Headers
import typings.next.distNextDashServerServerRouterMod.DynamicRoutes
import typings.next.distNextDashServerServerRouterMod.Params
import typings.next.distNextDashServerServerRouterMod.Route
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.UrlWithParsedQuery
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  var __sendPayload: js.Any = js.native
  var buildId: String = js.native
  var compression: js.UndefOr[js.Any] = js.native
  var customRoutes: js.UndefOr[Anon_Headers] = js.native
  var dir: String = js.native
  var distDir: String = js.native
  var dynamicRoutes: js.UndefOr[DynamicRoutes] = js.native
  var findPageComponents: js.Any = js.native
  var getPagePath: js.Any = js.native
  /**
    * Resolves `API` request, in development builds on demand
    * @param req http request
    * @param res http response
    * @param pathname path of request
    */
  var handleApiRequest: js.Any = js.native
  var handleCompression: js.Any = js.native
  var handleRequest: js.Any = js.native
  var hasStaticDir: Boolean = js.native
  var isServeableUrl: js.Any = js.native
  var logError: js.Any = js.native
  var nextConfig: NextConfig = js.native
  var onErrorMiddleware: js.UndefOr[js.Any] = js.native
  var pagesDir: js.UndefOr[String] = js.native
  var pagesManifest: js.UndefOr[StringDictionary[String]] = js.native
  var publicDir: String = js.native
  var quiet: Boolean = js.native
  var renderOpts: Anon_AmpBindInitData = js.native
  var renderToHTMLWithComponents: js.Any = js.native
  var router: typings.next.distNextDashServerServerRouterMod.default = js.native
  var serverBuildDir: String = js.native
  /* protected */ def _beforeCatchAllRender(_req: IncomingMessage, _res: ServerResponse, _params: Params, _parsedUrl: UrlWithParsedQuery): js.Promise[Boolean] = js.native
  /* private */ def _isLikeServerless(): js.Any = js.native
  /* protected */ def close(): js.Promise[Unit] = js.native
  /* protected */ def currentPhase(): String = js.native
  /* protected */ def ensureApiPage(pathname: String): js.Promise[Unit] = js.native
  /* protected */ def generatePublicRoutes(): js.Array[Route] = js.native
  /* protected */ def generateRoutes(): Anon_CatchAllRoute = js.native
  /* protected */ def getCustomRoutes(): js.Any = js.native
  /* protected */ def getDynamicRoutes(): js.Array[Anon_False] = js.native
  def getRequestHandler(): js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* parsedUrl */ js.UndefOr[UrlWithParsedQuery], 
    js.Promise[Unit]
  ] = js.native
  /* protected */ def hasPage(pathname: String): js.Promise[Boolean] = js.native
  def prepare(): js.Promise[Unit] = js.native
  /* protected */ def readBuildId(): String = js.native
  def render(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
  def render(req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
  def render(
    req: IncomingMessage,
    res: ServerResponse,
    pathname: String,
    query: ParsedUrlQuery,
    parsedUrl: UrlWithParsedQuery
  ): js.Promise[Unit] = js.native
  def render404(req: IncomingMessage, res: ServerResponse): js.Promise[Unit] = js.native
  def render404(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
  def renderError(err: Null, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
  def renderError(err: Null, req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
  def renderError(err: Error, req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[Unit] = js.native
  def renderError(err: Error, req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[Unit] = js.native
  def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[String | Null] = js.native
  def renderErrorToHTML(err: Null, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[String | Null] = js.native
  def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String): js.Promise[String | Null] = js.native
  def renderErrorToHTML(err: Error, req: IncomingMessage, res: ServerResponse, _pathname: String, query: ParsedUrlQuery): js.Promise[String | Null] = js.native
  def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String): js.Promise[String | Null] = js.native
  def renderToHTML(req: IncomingMessage, res: ServerResponse, pathname: String, query: ParsedUrlQuery): js.Promise[String | Null] = js.native
  def renderToHTML(
    req: IncomingMessage,
    res: ServerResponse,
    pathname: String,
    query: ParsedUrlQuery,
    hasAmphtmlDataOnlyHasAmp: Anon_Amphtml
  ): js.Promise[String | Null] = js.native
  /* protected */ def run(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
  /* protected */ def sendHTML(req: IncomingMessage, res: ServerResponse, html: String): js.Promise[Unit] = js.native
  def serveStatic(req: IncomingMessage, res: ServerResponse, path: String): js.Promise[Unit] = js.native
  def serveStatic(req: IncomingMessage, res: ServerResponse, path: String, parsedUrl: UrlWithParsedQuery): js.Promise[Unit] = js.native
  def setAssetPrefix(): Unit = js.native
  def setAssetPrefix(prefix: String): Unit = js.native
  /* protected */ def setImmutableAssetCacheControl(res: ServerResponse): Unit = js.native
}

