package typings.expressDashHttpDashProxy.expressDashHttpDashProxyMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  var filter: js.UndefOr[js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, Boolean]] = js.undefined
  var https: js.UndefOr[Boolean] = js.undefined
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    * See https://github.com/stream-utils/raw-body/blob/master/index.d.ts
    */
  var limit: js.UndefOr[Double | String] = js.undefined
  var memoizeHost: js.UndefOr[Boolean] = js.undefined
  var parseReqBody: js.UndefOr[Boolean] = js.undefined
  var preserveHostHdr: js.UndefOr[Boolean] = js.undefined
  var proxyErrorHandler: js.UndefOr[js.Function3[/* err */ js.Any, /* res */ Response, /* next */ NextFunction, _]] = js.undefined
  var proxyReqBodyDecorator: js.UndefOr[
    js.Function2[/* bodyContent */ js.Any, /* srcReq */ Request[ParamsDictionary], _]
  ] = js.undefined
  var proxyReqOptDecorator: js.UndefOr[
    js.Function2[
      /* proxyReqOpts */ RequestOptions, 
      /* srcReq */ Request[ParamsDictionary], 
      RequestOptions | js.Promise[RequestOptions]
    ]
  ] = js.undefined
  var proxyReqPathResolver: js.UndefOr[js.Function1[/* req */ Request[ParamsDictionary], String]] = js.undefined
  var reqAsBuffer: js.UndefOr[Boolean] = js.undefined
  var reqBodyEncoding: js.UndefOr[String | Null] = js.undefined
  var skipToNextHandlerFilter: js.UndefOr[js.Function1[/* proxyRes */ Response, Boolean]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var userResDecorator: js.UndefOr[
    js.Function4[
      /* proxyRes */ Response, 
      /* proxyResData */ js.Any, 
      /* userReq */ Request[ParamsDictionary], 
      /* userRes */ Response, 
      Buffer | String | (js.Promise[Buffer | String])
    ]
  ] = js.undefined
  var userResHeaderDecorator: js.UndefOr[
    js.Function5[
      /* headers */ IncomingHttpHeaders, 
      /* userReq */ Request[ParamsDictionary], 
      /* userRes */ Response, 
      /* proxyReq */ Request[ParamsDictionary], 
      /* proxyRes */ Response, 
      OutgoingHttpHeaders
    ]
  ] = js.undefined
}

object ProxyOptions {
  @scala.inline
  def apply(
    filter: (/* req */ Request[ParamsDictionary], /* res */ Response) => Boolean = null,
    https: js.UndefOr[Boolean] = js.undefined,
    limit: Double | String = null,
    memoizeHost: js.UndefOr[Boolean] = js.undefined,
    parseReqBody: js.UndefOr[Boolean] = js.undefined,
    preserveHostHdr: js.UndefOr[Boolean] = js.undefined,
    proxyErrorHandler: (/* err */ js.Any, /* res */ Response, /* next */ NextFunction) => _ = null,
    proxyReqBodyDecorator: (/* bodyContent */ js.Any, /* srcReq */ Request[ParamsDictionary]) => _ = null,
    proxyReqOptDecorator: (/* proxyReqOpts */ RequestOptions, /* srcReq */ Request[ParamsDictionary]) => RequestOptions | js.Promise[RequestOptions] = null,
    proxyReqPathResolver: /* req */ Request[ParamsDictionary] => String = null,
    reqAsBuffer: js.UndefOr[Boolean] = js.undefined,
    reqBodyEncoding: String = null,
    skipToNextHandlerFilter: /* proxyRes */ Response => Boolean = null,
    timeout: Int | Double = null,
    userResDecorator: (/* proxyRes */ Response, /* proxyResData */ js.Any, /* userReq */ Request[ParamsDictionary], /* userRes */ Response) => Buffer | String | (js.Promise[Buffer | String]) = null,
    userResHeaderDecorator: (/* headers */ IncomingHttpHeaders, /* userReq */ Request[ParamsDictionary], /* userRes */ Response, /* proxyReq */ Request[ParamsDictionary], /* proxyRes */ Response) => OutgoingHttpHeaders = null
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(memoizeHost)) __obj.updateDynamic("memoizeHost")(memoizeHost.asInstanceOf[js.Any])
    if (!js.isUndefined(parseReqBody)) __obj.updateDynamic("parseReqBody")(parseReqBody.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveHostHdr)) __obj.updateDynamic("preserveHostHdr")(preserveHostHdr.asInstanceOf[js.Any])
    if (proxyErrorHandler != null) __obj.updateDynamic("proxyErrorHandler")(js.Any.fromFunction3(proxyErrorHandler))
    if (proxyReqBodyDecorator != null) __obj.updateDynamic("proxyReqBodyDecorator")(js.Any.fromFunction2(proxyReqBodyDecorator))
    if (proxyReqOptDecorator != null) __obj.updateDynamic("proxyReqOptDecorator")(js.Any.fromFunction2(proxyReqOptDecorator))
    if (proxyReqPathResolver != null) __obj.updateDynamic("proxyReqPathResolver")(js.Any.fromFunction1(proxyReqPathResolver))
    if (!js.isUndefined(reqAsBuffer)) __obj.updateDynamic("reqAsBuffer")(reqAsBuffer.asInstanceOf[js.Any])
    if (reqBodyEncoding != null) __obj.updateDynamic("reqBodyEncoding")(reqBodyEncoding.asInstanceOf[js.Any])
    if (skipToNextHandlerFilter != null) __obj.updateDynamic("skipToNextHandlerFilter")(js.Any.fromFunction1(skipToNextHandlerFilter))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userResDecorator != null) __obj.updateDynamic("userResDecorator")(js.Any.fromFunction4(userResDecorator))
    if (userResHeaderDecorator != null) __obj.updateDynamic("userResHeaderDecorator")(js.Any.fromFunction5(userResHeaderDecorator))
    __obj.asInstanceOf[ProxyOptions]
  }
}

