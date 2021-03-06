package typings.topojsonDashClient

import typings.geojson.geojsonMod.BBox
import typings.geojson.geojsonMod.Feature
import typings.geojson.geojsonMod.FeatureCollection
import typings.geojson.geojsonMod.GeometryObject
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryCollection
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.LineString
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiLineString
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPoint
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPolygon
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Point
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Polygon
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("topojson-client", JSImport.Namespace)
@js.native
object topojsonDashClientMod extends js.Object {
  def bbox(topology: Topology[Objects[Properties]]): BBox = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: GeometryCollection[P]): FeatureCollection[GeometryObject, P] = js.native
  def feature[P](
    topology: Topology[Objects[Properties]],
    `object`: typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[P]
  ): (Feature[GeometryObject, P]) | (FeatureCollection[GeometryObject, P]) = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: LineString[P]): Feature[typings.geojson.geojsonMod.LineString, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiLineString[P]): Feature[typings.geojson.geojsonMod.MultiLineString, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPoint[P]): Feature[typings.geojson.geojsonMod.MultiPoint, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: MultiPolygon[P]): Feature[typings.geojson.geojsonMod.MultiPolygon, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Point[P]): Feature[typings.geojson.geojsonMod.Point, P] = js.native
  def feature[P](topology: Topology[Objects[Properties]], `object`: Polygon[P]): Feature[typings.geojson.geojsonMod.Polygon, P] = js.native
  def merge(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): typings.geojson.geojsonMod.MultiPolygon = js.native
  def mergeArcs(
    topology: Topology[Objects[Properties]],
    objects: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  ): MultiPolygon[js.Object] = js.native
  def mesh(topology: Topology[Objects[Properties]]): typings.geojson.geojsonMod.MultiLineString = js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object]
  ): typings.geojson.geojsonMod.MultiLineString = js.native
  def mesh(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      /* b */ typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      Boolean
    ]
  ): typings.geojson.geojsonMod.MultiLineString = js.native
  def meshArcs(topology: Topology[Objects[Properties]]): MultiLineString[js.Object] = js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object]
  ): MultiLineString[js.Object] = js.native
  def meshArcs(
    topology: Topology[Objects[Properties]],
    obj: typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object],
    filter: js.Function2[
      /* a */ typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      /* b */ typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object], 
      Boolean
    ]
  ): MultiLineString[js.Object] = js.native
  def neighbors(
    objects: js.Array[
      typings.topojsonDashSpecification.topojsonDashSpecificationMod.GeometryObject[js.Object]
    ]
  ): js.Array[js.Array[Double]] = js.native
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Double): Topology[T] = js.native
  def quantize[T /* <: Objects[js.Object] */](topology: Topology[T], transform: Transform): Topology[T] = js.native
  def transform(): Transformer = js.native
  def transform(transform: Transform): Transformer = js.native
  def untransform(): Transformer = js.native
  def untransform(transform: Transform): Transformer = js.native
  type Transformer = js.Function2[/* point */ js.Array[Double], /* index */ js.UndefOr[Boolean], js.Array[Double]]
}

