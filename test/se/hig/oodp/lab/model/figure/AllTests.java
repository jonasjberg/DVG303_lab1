/**
 * DVG303 :: Objektorienterad design och programmering
 * 860224 Jonas Sjöberg
 * Högskolan i Gävle
 * tel12jsg@student.hig.se
 */

package se.hig.oodp.lab.model.figure;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import se.hig.oodp.lab.model.simplefigure.EllipseTest;

/**
 * @author  Jonas Sjöberg
 *		    tel12jsg@student.hig.se
 * @date	Sep 28, 2015
 */
//@formatter:off
@RunWith(Suite.class)
@Suite.SuiteClasses ({
                        CircleTest.class,
                        EllipseTest.class,
                      //FigureTest.class
                        LineTest.class,
                        PointTest.class,
                        RectangleTest.class,
                        SquareTest.class,
                        TriangleTest.class
                    })
//@formatter:on

public class AllTests {}
