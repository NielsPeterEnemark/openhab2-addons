/**
 * openHAB, the open Home Automation Bus.
 * Copyright (C) 2011, openHAB.org <admin@openhab.org>
 *
 * See the contributors.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * If you modify this Program, or any covered work, by linking or
 * combining it with Eclipse (or a modified version of that library),
 * containing parts covered by the terms of the Eclipse Public License
 * (EPL), the licensors of this Program grant you additional permission
 * to convey the resulting work.
 */

package org.openhab.model.sitemap.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhab.model.sitemap.Frame;
import org.openhab.model.sitemap.Group;
import org.openhab.model.sitemap.Image;
import org.openhab.model.sitemap.LinkableWidget;
import org.openhab.model.sitemap.List;
import org.openhab.model.sitemap.Mapping;
import org.openhab.model.sitemap.Selection;
import org.openhab.model.sitemap.Sitemap;
import org.openhab.model.sitemap.SitemapFactory;
import org.openhab.model.sitemap.SitemapModel;
import org.openhab.model.sitemap.SitemapPackage;
import org.openhab.model.sitemap.Slider;
import org.openhab.model.sitemap.Switch;
import org.openhab.model.sitemap.Text;
import org.openhab.model.sitemap.Widget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SitemapPackageImpl extends EPackageImpl implements SitemapPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sitemapModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sitemapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass widgetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkableWidgetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass frameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sliderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.openhab.model.sitemap.SitemapPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SitemapPackageImpl()
  {
    super(eNS_URI, SitemapFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SitemapPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SitemapPackage init()
  {
    if (isInited) return (SitemapPackage)EPackage.Registry.INSTANCE.getEPackage(SitemapPackage.eNS_URI);

    // Obtain or create and register package
    SitemapPackageImpl theSitemapPackage = (SitemapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SitemapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SitemapPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSitemapPackage.createPackageContents();

    // Initialize created meta-data
    theSitemapPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSitemapPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SitemapPackage.eNS_URI, theSitemapPackage);
    return theSitemapPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSitemapModel()
  {
    return sitemapModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSitemap()
  {
    return sitemapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSitemap_Name()
  {
    return (EAttribute)sitemapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSitemap_Label()
  {
    return (EAttribute)sitemapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSitemap_Icon()
  {
    return (EAttribute)sitemapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSitemap_Children()
  {
    return (EReference)sitemapEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWidget()
  {
    return widgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWidget_Label()
  {
    return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWidget_Icon()
  {
    return (EAttribute)widgetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWidget_Item()
  {
    return (EAttribute)widgetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkableWidget()
  {
    return linkableWidgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkableWidget_Children()
  {
    return (EReference)linkableWidgetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFrame()
  {
    return frameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getText()
  {
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroup()
  {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImage()
  {
    return imageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Url()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitch()
  {
    return switchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_Mappings()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSlider()
  {
    return sliderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlider_Frequency()
  {
    return (EAttribute)sliderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSlider_SwitchEnabled()
  {
    return (EAttribute)sliderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelection()
  {
    return selectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelection_Mappings()
  {
    return (EReference)selectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList()
  {
    return listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getList_Separator()
  {
    return (EAttribute)listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapping()
  {
    return mappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapping_Cmd()
  {
    return (EAttribute)mappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapping_Label()
  {
    return (EAttribute)mappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SitemapFactory getSitemapFactory()
  {
    return (SitemapFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    sitemapModelEClass = createEClass(SITEMAP_MODEL);

    sitemapEClass = createEClass(SITEMAP);
    createEAttribute(sitemapEClass, SITEMAP__NAME);
    createEAttribute(sitemapEClass, SITEMAP__LABEL);
    createEAttribute(sitemapEClass, SITEMAP__ICON);
    createEReference(sitemapEClass, SITEMAP__CHILDREN);

    widgetEClass = createEClass(WIDGET);
    createEAttribute(widgetEClass, WIDGET__LABEL);
    createEAttribute(widgetEClass, WIDGET__ICON);
    createEAttribute(widgetEClass, WIDGET__ITEM);

    linkableWidgetEClass = createEClass(LINKABLE_WIDGET);
    createEReference(linkableWidgetEClass, LINKABLE_WIDGET__CHILDREN);

    frameEClass = createEClass(FRAME);

    textEClass = createEClass(TEXT);

    groupEClass = createEClass(GROUP);

    imageEClass = createEClass(IMAGE);
    createEAttribute(imageEClass, IMAGE__URL);

    switchEClass = createEClass(SWITCH);
    createEReference(switchEClass, SWITCH__MAPPINGS);

    sliderEClass = createEClass(SLIDER);
    createEAttribute(sliderEClass, SLIDER__FREQUENCY);
    createEAttribute(sliderEClass, SLIDER__SWITCH_ENABLED);

    selectionEClass = createEClass(SELECTION);
    createEReference(selectionEClass, SELECTION__MAPPINGS);

    listEClass = createEClass(LIST);
    createEAttribute(listEClass, LIST__SEPARATOR);

    mappingEClass = createEClass(MAPPING);
    createEAttribute(mappingEClass, MAPPING__CMD);
    createEAttribute(mappingEClass, MAPPING__LABEL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    sitemapEClass.getESuperTypes().add(this.getSitemapModel());
    linkableWidgetEClass.getESuperTypes().add(this.getWidget());
    frameEClass.getESuperTypes().add(this.getLinkableWidget());
    textEClass.getESuperTypes().add(this.getLinkableWidget());
    groupEClass.getESuperTypes().add(this.getLinkableWidget());
    imageEClass.getESuperTypes().add(this.getLinkableWidget());
    switchEClass.getESuperTypes().add(this.getWidget());
    sliderEClass.getESuperTypes().add(this.getWidget());
    selectionEClass.getESuperTypes().add(this.getWidget());
    listEClass.getESuperTypes().add(this.getWidget());

    // Initialize classes and features; add operations and parameters
    initEClass(sitemapModelEClass, SitemapModel.class, "SitemapModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sitemapEClass, Sitemap.class, "Sitemap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSitemap_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sitemap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSitemap_Label(), ecorePackage.getEString(), "label", null, 0, 1, Sitemap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSitemap_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Sitemap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSitemap_Children(), this.getWidget(), null, "children", null, 0, -1, Sitemap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWidget_Label(), ecorePackage.getEString(), "label", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWidget_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWidget_Item(), ecorePackage.getEString(), "item", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkableWidgetEClass, LinkableWidget.class, "LinkableWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLinkableWidget_Children(), this.getWidget(), null, "children", null, 0, -1, LinkableWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(frameEClass, Frame.class, "Frame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImage_Url(), ecorePackage.getEString(), "url", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitch_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sliderEClass, Slider.class, "Slider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSlider_Frequency(), ecorePackage.getEString(), "frequency", null, 0, 1, Slider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSlider_SwitchEnabled(), ecorePackage.getEBoolean(), "switchEnabled", null, 0, 1, Slider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelection_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getList_Separator(), ecorePackage.getEString(), "separator", null, 0, 1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMapping_Cmd(), ecorePackage.getEString(), "cmd", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMapping_Label(), ecorePackage.getEString(), "label", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SitemapPackageImpl
