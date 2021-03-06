package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.frameworkNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link ResourceId} service provides several constructors for resource ids.
  *
  * They mainly differ in how the anchor is specified.
  */
trait ResourceId extends XResourceId {
  /**
    * Create a resource id that has no anchor.
    *
    * This constructor can be used to create resource ids for panes.
    */
  def create(sResourceURL: String): Unit
  /** Create an empty resource id. It does not specify a specific resource but describes the absence of one. */
  def createEmpty(): Unit
  /** Create a resource id for an anchor that is given as {@link XResourceId} object. This is the most general of the constructor variants. */
  def createWithAnchor(sResourceURL: String, xAnchor: XResourceId): Unit
  /**
    * Create a resource id for a resource that is bound to an anchor that can be specified by a single URL.
    *
    * This constructor can be used to create resources ids for views where the anchor is a pane.
    */
  def createWithAnchorURL(sResourceURL: String, sAnchorURL: String): Unit
}

object ResourceId {
  @scala.inline
  def apply(
    Anchor: XResourceId,
    AnchorURLs: SafeArray[String],
    FullResourceURL: URL,
    ResourceTypePrefix: String,
    ResourceURL: String,
    clone: () => XResourceId,
    compareTo: XResourceId => Double,
    create: String => Unit,
    createEmpty: () => Unit,
    createWithAnchor: (String, XResourceId) => Unit,
    createWithAnchorURL: (String, String) => Unit,
    getAnchor: () => XResourceId,
    getAnchorURLs: () => SafeArray[String],
    getFullResourceURL: () => URL,
    getResourceTypePrefix: () => String,
    getResourceURL: () => String,
    hasAnchor: () => Boolean,
    isBoundTo: (XResourceId, AnchorBindingMode) => Boolean,
    isBoundToURL: (String, AnchorBindingMode) => Boolean
  ): ResourceId = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorURLs = AnchorURLs, FullResourceURL = FullResourceURL, ResourceTypePrefix = ResourceTypePrefix, ResourceURL = ResourceURL, clone = js.Any.fromFunction0(clone), compareTo = js.Any.fromFunction1(compareTo), create = js.Any.fromFunction1(create), createEmpty = js.Any.fromFunction0(createEmpty), createWithAnchor = js.Any.fromFunction2(createWithAnchor), createWithAnchorURL = js.Any.fromFunction2(createWithAnchorURL), getAnchor = js.Any.fromFunction0(getAnchor), getAnchorURLs = js.Any.fromFunction0(getAnchorURLs), getFullResourceURL = js.Any.fromFunction0(getFullResourceURL), getResourceTypePrefix = js.Any.fromFunction0(getResourceTypePrefix), getResourceURL = js.Any.fromFunction0(getResourceURL), hasAnchor = js.Any.fromFunction0(hasAnchor), isBoundTo = js.Any.fromFunction2(isBoundTo), isBoundToURL = js.Any.fromFunction2(isBoundToURL))
  
    __obj.asInstanceOf[ResourceId]
  }
}

