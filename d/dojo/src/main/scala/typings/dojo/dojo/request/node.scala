package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/node.html
  *
  * Sends a request using the included http or https interface from node.js
  * with the given URL and options.
  *
  * @param url URL to request
  * @param options       OptionalOptions for the request.
  */
@js.native
trait node extends js.Object {
  def apply(url: String): Unit = js.native
  def apply(url: String, options: typings.dojo.dojo.request.node.__Options): Unit = js.native
  /**
    * Send an HTTP DELETE request using XMLHttpRequest with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def del(url: String): __Promise = js.native
  def del(url: String, options: typings.dojo.dojo.request.node.__BaseOptions): __Promise = js.native
  /**
    * Send an HTTP GET request using XMLHttpRequest with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def get(url: String): __Promise = js.native
  def get(url: String, options: typings.dojo.dojo.request.node.__BaseOptions): __Promise = js.native
  /**
    * Send an HTTP POST request using XMLHttpRequest with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def post(url: String): __Promise = js.native
  def post(url: String, options: typings.dojo.dojo.request.node.__BaseOptions): __Promise = js.native
  /**
    * Send an HTTP PUT request using XMLHttpRequest with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def put(url: String): __Promise = js.native
  def put(url: String, options: typings.dojo.dojo.request.node.__BaseOptions): __Promise = js.native
}

@JSGlobal("dojo.request.node")
@js.native
object node extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/node.__BaseOptions.html
    *
    *
    */
  @js.native
  class __BaseOptions () extends js.Object {
    /**
      * Data to transfer. This is ignored for GET and DELETE
      * requests.
      *
      */
    var data: String = js.native
    /**
      * How to handle the response from the server.  Default is
      * 'text'.  Other values are 'json', 'javascript', and 'xml'.
      *
      */
    var handleAs: String = js.native
    /**
      * Headers to use for the request.
      *
      */
    var headers: js.Object = js.native
    /**
      * Password to use during the request.
      *
      */
    var password: String = js.native
    /**
      * Whether to append a cache-busting parameter to the URL.
      *
      */
    var preventCache: Boolean = js.native
    /**
      * Query parameters to append to the URL.
      *
      */
    var query: String = js.native
    /**
      * Milliseconds to wait for the response.  If this time
      * passes, the then the promise is rejected.
      *
      */
    var timeout: Double = js.native
    /**
      * Username to use during the request.
      *
      */
    var user: String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/node.__MethodOptions.html
    *
    *
    */
  @js.native
  class __MethodOptions () extends js.Object {
    /**
      * The HTTP method to use to make the request. Must be
      * uppercase. Default is "GET".
      *
      */
    var method: String = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/node.__Options.html
    *
    *
    */
  @js.native
  class __Options () extends js.Object {
    /**
      * Data to transfer. This is ignored for GET and DELETE
      * requests.
      *
      */
    var data: String = js.native
    /**
      * How to handle the response from the server.  Default is
      * 'text'.  Other values are 'json', 'javascript', and 'xml'.
      *
      */
    var handleAs: String = js.native
    /**
      * Headers to use for the request.
      *
      */
    var headers: js.Object = js.native
    /**
      * The HTTP method to use to make the request. Must be
      * uppercase. Default is "GET".
      *
      */
    var method: String = js.native
    /**
      * Password to use during the request.
      *
      */
    var password: String = js.native
    /**
      * Whether to append a cache-busting parameter to the URL.
      *
      */
    var preventCache: Boolean = js.native
    /**
      * Query parameters to append to the URL.
      *
      */
    var query: String = js.native
    /**
      * Milliseconds to wait for the response.  If this time
      * passes, the then the promise is rejected.
      *
      */
    var timeout: Double = js.native
    /**
      * Username to use during the request.
      *
      */
    var user: String = js.native
  }
  
}

