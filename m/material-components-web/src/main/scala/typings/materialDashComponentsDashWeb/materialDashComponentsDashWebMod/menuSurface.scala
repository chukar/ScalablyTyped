package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialMenuDashSurface.Anon_ANCHOR
import typings.atMaterialMenuDashSurface.Anon_ANCHORTOMENUSURFACEWIDTHRATIO
import typings.atMaterialMenuDashSurface.Anon_CLOSEDEVENT
import typings.atMaterialMenuDashSurface.adapterMod.MDCMenuSurfaceAdapter
import typings.atMaterialMenuDashSurface.utilMod.CssTransformPropertyName
import typings.std.Element
import typings.std.Partial
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "menuSurface")
@js.native
object menuSurface extends js.Object {
  @js.native
  class MDCMenuSurface ()
    extends typings.atMaterialMenuDashSurface.atMaterialMenuDashSurfaceMod.MDCMenuSurface
  
  @js.native
  class MDCMenuSurfaceFoundation ()
    extends typings.atMaterialMenuDashSurface.atMaterialMenuDashSurfaceMod.MDCMenuSurfaceFoundation {
    def this(adapter: Partial[MDCMenuSurfaceAdapter]) = this()
  }
  
  /**
    * Enum for representing an element corner for positioning the menu-surface.
    *
    * The START constants map to LEFT if element directionality is left
    * to right and RIGHT if the directionality is right to left.
    * Likewise END maps to RIGHT or LEFT depending on the directionality.
    */
  @js.native
  object Corner extends js.Object {
    /* 13 */ val BOTTOM_END: typings.atMaterialMenuDashSurface.constantsMod.Corner.BOTTOM_END with Double = js.native
    /* 1 */ val BOTTOM_LEFT: typings.atMaterialMenuDashSurface.constantsMod.Corner.BOTTOM_LEFT with Double = js.native
    /* 5 */ val BOTTOM_RIGHT: typings.atMaterialMenuDashSurface.constantsMod.Corner.BOTTOM_RIGHT with Double = js.native
    /* 9 */ val BOTTOM_START: typings.atMaterialMenuDashSurface.constantsMod.Corner.BOTTOM_START with Double = js.native
    /* 12 */ val TOP_END: typings.atMaterialMenuDashSurface.constantsMod.Corner.TOP_END with Double = js.native
    /* 0 */ val TOP_LEFT: typings.atMaterialMenuDashSurface.constantsMod.Corner.TOP_LEFT with Double = js.native
    /* 4 */ val TOP_RIGHT: typings.atMaterialMenuDashSurface.constantsMod.Corner.TOP_RIGHT with Double = js.native
    /* 8 */ val TOP_START: typings.atMaterialMenuDashSurface.constantsMod.Corner.TOP_START with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atMaterialMenuDashSurface.constantsMod.Corner with Double] = js.native
  }
  
  /**
    * Enum for bits in the {@see Corner) bitmap.
    */
  @js.native
  object CornerBit extends js.Object {
    /* 1 */ val BOTTOM: typings.atMaterialMenuDashSurface.constantsMod.CornerBit.BOTTOM with Double = js.native
    /* 2 */ val CENTER: typings.atMaterialMenuDashSurface.constantsMod.CornerBit.CENTER with Double = js.native
    /* 8 */ val FLIP_RTL: typings.atMaterialMenuDashSurface.constantsMod.CornerBit.FLIP_RTL with Double = js.native
    /* 4 */ val RIGHT: typings.atMaterialMenuDashSurface.constantsMod.CornerBit.RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atMaterialMenuDashSurface.constantsMod.CornerBit with Double] = js.native
  }
  
  /* static members */
  @js.native
  object MDCMenuSurface extends js.Object {
    def attachTo(root: Element): typings.atMaterialMenuDashSurface.componentMod.MDCMenuSurface = js.native
  }
  
  /* static members */
  @js.native
  object MDCMenuSurfaceFoundation extends js.Object {
    val Corner: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Corner */ js.Any = js.native
    val cssClasses: Anon_ANCHOR = js.native
    /**
      * @see {@link MDCMenuSurfaceAdapter} for typing information on parameters and return types.
      */
    val defaultAdapter: MDCMenuSurfaceAdapter = js.native
    val numbers: Anon_ANCHORTOMENUSURFACEWIDTHRATIO = js.native
    val strings: Anon_CLOSEDEVENT = js.native
  }
  
  /**
    * @license
    * Copyright 2018 Google Inc.
    *
    * Permission is hereby granted, free of charge, to any person obtaining a copy
    * of this software and associated documentation files (the "Software"), to deal
    * in the Software without restriction, including without limitation the rights
    * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    * copies of the Software, and to permit persons to whom the Software is
    * furnished to do so, subject to the following conditions:
    *
    * The above copyright notice and this permission notice shall be included in
    * all copies or substantial portions of the Software.
    *
    * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    * THE SOFTWARE.
    */
  @js.native
  object cssClasses extends js.Object {
    var ANCHOR: String = js.native
    var ANIMATING_CLOSED: String = js.native
    var ANIMATING_OPEN: String = js.native
    var FIXED: String = js.native
    var OPEN: String = js.native
    var ROOT: String = js.native
  }
  
  @js.native
  object numbers extends js.Object {
    /** Ratio of anchor width to menu-surface width for switching from corner positioning to center positioning. */
    var ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double = js.native
    /** Margin left to the edge of the viewport when menu-surface is at maximum possible height. */
    var MARGIN_TO_EDGE: Double = js.native
    /** Total duration of menu-surface close animation. */
    var TRANSITION_CLOSE_DURATION: Double = js.native
    /** Total duration of menu-surface open animation. */
    var TRANSITION_OPEN_DURATION: Double = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var CLOSED_EVENT: String = js.native
    var FOCUSABLE_ELEMENTS: String = js.native
    var OPENED_EVENT: String = js.native
  }
  
  @js.native
  object util extends js.Object {
    /**
      * Returns the name of the correct transform property to use on the current browser.
      */
    def getTransformPropertyName(globalObj: Window): CssTransformPropertyName = js.native
    def getTransformPropertyName(globalObj: Window, forceRefresh: Boolean): CssTransformPropertyName = js.native
  }
  
}

