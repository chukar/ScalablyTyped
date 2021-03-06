package typings.dojo.dijit.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.active
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.buttonWidget
import typings.dojo.dojoStrings.contentWidget
import typings.dojo.dojoStrings.cssStateNodes
import typings.dojo.dojoStrings.duration
import typings.dojo.dojoStrings.hovering
import typings.dojo.dojoStrings.iconClassAttr
import typings.dojo.dojoStrings.isLayoutContainer
import typings.dojo.dojoStrings.label
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/AccordionContainer.html
  *
  * Holds a set of panes where every pane's title is visible, but only one pane's content is visible at a time,
  * and switching between panes is visualized by sliding the other panes up/down.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.layout.AccordionContainer")
@js.native
class AccordionContainer () extends StackContainer {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Amount of time (in ms) it takes to slide panes
    * 
    */
  var duration: Double = js.native
  /**
    * The name of the widget used to display the title of each pane
    * 
    */
  def buttonWidget(): Unit = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  /**
    * 
    * @param child             
    */
  def removeChild(child: js.Any): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("watch")
  def watch_duration(
    property: duration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

@JSGlobal("dijit.layout.AccordionContainer")
@js.native
object AccordionContainer extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/AccordionContainer._Button.html
    *
    * The title bar to click to open up an accordion pane.
    * Internal widget used by AccordionContainer.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
  - typings.dojo.dijit._CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering
  - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
  class _Button () extends _Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * True if mouse was pressed while over this widget, and hasn't been released yet
      * 
      */
    var active: Boolean = js.native
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      * 
      */
    var attachScope: js.Object = js.native
    /**
      * Subclasses may define a cssStateNodes property that lists sub-nodes within the widget that
      * need CSS classes applied on mouse hover/press and focus.
      * 
      * Each entry in this optional hash is a an attach-point name (like "upArrowButton") mapped to a CSS class name
      * (like "dijitUpArrowButton"). Example:
      * 
      * {
      *     "upArrowButton": "dijitUpArrowButton",
      *     "downArrowButton": "dijitDownArrowButton"
      * }
      * The above will set the CSS class dijitUpArrowButton to the this.upArrowButton DOMNode when it
      * 
      * is hovered, etc.
      * 
      */
    var cssStateNodes: js.Object = js.native
    /**
      * True if cursor is over this widget
      * 
      */
    var hovering: Boolean = js.native
    /**
      * CSS class for icon to left of label
      * 
      */
    var iconClassAttr: String = js.native
    /**
      * Title of the pane
      * 
      */
    var label: String = js.native
    /**
      * 
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      * 
      */
    @JSName("style")
    var style__Button: String = js.native
    /**
      * Path to template (HTML file) for this widget relative to dojo.baseUrl.
      * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
      * 
      */
    var templatePath: String = js.native
    /**
      * 
      */
    var templateString: String = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      */
    def getCachedTemplate(): js.Any = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      * 
      * @param templateString The template             
      * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
      * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
      */
    def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
    def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
    /**
      * Returns the height of the title dom node.
      * 
      */
    def getTitleHeight(): js.Any = js.native
    @JSName("get")
    def get_active(property: active): Boolean = js.native
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
    @JSName("get")
    def get_hovering(property: hovering): Boolean = js.native
    @JSName("get")
    def get_iconClassAttr(property: iconClassAttr): String = js.native
    @JSName("get")
    def get_label(property: label): String = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("set")
    def set_active(property: active, value: Boolean): Unit = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
    @JSName("set")
    def set_hovering(property: hovering, value: Boolean): Unit = js.native
    @JSName("set")
    def set_iconClassAttr(property: iconClassAttr, value: String): Unit = js.native
    @JSName("set")
    def set_label(property: label, value: String): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("watch")
    def watch_active(
      property: active,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_attachScope(
      property: attachScope,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_cssStateNodes(
      property: cssStateNodes,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_hovering(
      property: hovering,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_iconClassAttr(
      property: iconClassAttr,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_label(
      property: label,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(
      property: searchContainerNode,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templatePath(
      property: templatePath,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_templateString(
      property: templateString,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/AccordionContainer._InnerContainer.html
    *
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.dojo.dijit._CssStateMixin because Inheritance from two classes. Inlined active, cssStateNodes, hovering */ @js.native
  class _InnerContainer () extends _Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * True if mouse was pressed while over this widget, and hasn't been released yet
      * 
      */
    var active: Boolean = js.native
    /**
      * Class to use to instantiate title
      * (Wish we didn't have a separate widget for just the title but maintaining it
      * for backwards compatibility, is it worth it?)
      * 
      */
    var buttonWidget: js.Function = js.native
    /**
      * Pointer to the real child widget
      * 
      */
    var contentWidget: js.Object = js.native
    /**
      * Subclasses may define a cssStateNodes property that lists sub-nodes within the widget that
      * need CSS classes applied on mouse hover/press and focus.
      * 
      * Each entry in this optional hash is a an attach-point name (like "upArrowButton") mapped to a CSS class name
      * (like "dijitUpArrowButton"). Example:
      * 
      * {
      *     "upArrowButton": "dijitUpArrowButton",
      *     "downArrowButton": "dijitDownArrowButton"
      * }
      * The above will set the CSS class dijitUpArrowButton to the this.upArrowButton DOMNode when it
      * 
      * is hovered, etc.
      * 
      */
    var cssStateNodes: js.Object = js.native
    /**
      * True if cursor is over this widget
      * 
      */
    var hovering: Boolean = js.native
    /**
      * 
      */
    var isLayoutContainer: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      * 
      */
    @JSName("style")
    var style__InnerContainer: String = js.native
    @JSName("get")
    def get_active(property: active): Boolean = js.native
    @JSName("get")
    def get_buttonWidget(property: buttonWidget): js.Function = js.native
    @JSName("get")
    def get_contentWidget(property: contentWidget): js.Object = js.native
    @JSName("get")
    def get_cssStateNodes(property: cssStateNodes): js.Object = js.native
    @JSName("get")
    def get_hovering(property: hovering): Boolean = js.native
    @JSName("get")
    def get_isLayoutContainer(property: isLayoutContainer): Boolean = js.native
    @JSName("set")
    def set_active(property: active, value: Boolean): Unit = js.native
    @JSName("set")
    def set_buttonWidget(property: buttonWidget, value: js.Function): Unit = js.native
    @JSName("set")
    def set_contentWidget(property: contentWidget, value: js.Object): Unit = js.native
    @JSName("set")
    def set_cssStateNodes(property: cssStateNodes, value: js.Object): Unit = js.native
    @JSName("set")
    def set_hovering(property: hovering, value: Boolean): Unit = js.native
    @JSName("set")
    def set_isLayoutContainer(property: isLayoutContainer, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("watch")
    def watch_active(
      property: active,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_buttonWidget(
      property: buttonWidget,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Function], 
          /* newValue */ js.UndefOr[js.Function], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_contentWidget(
      property: contentWidget,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_cssStateNodes(
      property: cssStateNodes,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_hovering(
      property: hovering,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_isLayoutContainer(
      property: isLayoutContainer,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
  }
  
}

