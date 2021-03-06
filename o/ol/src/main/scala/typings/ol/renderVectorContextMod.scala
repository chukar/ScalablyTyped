package typings.ol

import typings.ol.featureMod.FeatureLike
import typings.ol.renderCanvasMod.DeclutterGroup
import typings.ol.renderCanvasMod.DeclutterGroups
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/VectorContext", JSImport.Namespace)
@js.native
object renderVectorContextMod extends js.Object {
  @js.native
  trait VectorContext extends js.Object {
    def drawCircle(
      circleGeometry: typings.ol.geomCircleMod.default,
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
    ): Unit = js.native
    def drawCustom(
      geometry: typings.ol.geomSimpleGeometryMod.default,
      feature: FeatureLike,
      renderer: js.Function0[Unit]
    ): Unit = js.native
    def drawFeature(
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
      style: typings.ol.styleStyleMod.default
    ): Unit = js.native
    def drawGeometry(geometry: typings.ol.geomGeometryMod.default): Unit = js.native
    def drawGeometryCollection(
      geometryCollectionGeometry: typings.ol.geomGeometryCollectionMod.default,
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
    ): Unit = js.native
    def drawLineString(lineStringGeometry: typings.ol.geomLineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawLineString(lineStringGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiLineString(multiLineStringGeometry: typings.ol.geomMultiLineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiLineString(multiLineStringGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiPoint(multiPointGeometry: typings.ol.geomMultiPointMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiPoint(multiPointGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiPolygon(multiPolygonGeometry: typings.ol.geomMultiPolygonMod.default, feature: FeatureLike): Unit = js.native
    def drawPoint(pointGeometry: typings.ol.geomPointMod.default, feature: FeatureLike): Unit = js.native
    def drawPoint(pointGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawPolygon(polygonGeometry: typings.ol.geomPolygonMod.default, feature: FeatureLike): Unit = js.native
    def drawPolygon(polygonGeometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawText(geometry: typings.ol.geomGeometryMod.default, feature: FeatureLike): Unit = js.native
    def drawText(geometry: typings.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def setFillStrokeStyle(fillStyle: typings.ol.styleFillMod.default, strokeStyle: typings.ol.styleStrokeMod.default): Unit = js.native
    def setImageStyle(imageStyle: typings.ol.styleImageMod.default): Unit = js.native
    def setImageStyle(imageStyle: typings.ol.styleImageMod.default, opt_declutterGroup: DeclutterGroup): Unit = js.native
    def setStyle(style: typings.ol.styleStyleMod.default): Unit = js.native
    def setTextStyle(textStyle: typings.ol.styleTextMod.default): Unit = js.native
    def setTextStyle(textStyle: typings.ol.styleTextMod.default, opt_declutterGroups: DeclutterGroups): Unit = js.native
  }
  
  @js.native
  class default () extends VectorContext
  
}

