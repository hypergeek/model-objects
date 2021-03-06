/**
 * Copyright (c) 2012, Regents of the University of California
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *   Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *   Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 **/

package edu.berkeley.path.model_objects.scenario;

import edu.berkeley.path.model_objects.jaxb.*;
import edu.berkeley.path.model_objects.network.Network;

import java.util.List;

public class Scenario extends edu.berkeley.path.model_objects.jaxb.Scenario {
  // Store internal set ID for scenario components
  /** @y.exclude */  private Long splitRatioSetId;
  /** @y.exclude */  private Long demandSetId;
  /** @y.exclude */  private Long fdSetId;
  /** @y.exclude */  private Long sensorSetId;
  /** @y.exclude */  private Long routeSetId;

  /**
   * Get the list of networks for this scenario
   * @return  a List of Network model objects
   */
  public List<Network> getListOfNetworks() {
    // Check for null NetworkSet
    NetworkSet networkSet = super.getNetworkSet();
    if(networkSet == null) {
      super.setNetworkSet(new NetworkSet());
    }

    return (List<Network>) (List<?>) super.getNetworkSet().getNetwork();
  }

  /**
   * Set the list of networks for this scenario
   * @param networks  list of Network MO
   */
  public void setListOfNetworks(List<Network> networks) {
    super.getNetworkSet().getNetwork().clear();
    super.getNetworkSet().getNetwork().addAll(networks);
  }

  @Override
  public String getDescription() {
    return super.getDescription();
  }

  @Override
  public void setDescription(String value) {
    super.setDescription(value);
  }

  //TODO Settings?
  @Override
  public Settings getSettings() {
    return super.getSettings();
  }

  @Override
  public void setSettings(Settings value) {
    super.setSettings(value);
  }

  //TODO Needs VehicleTypeSetMO
  @Override
  public VehicleTypeSet getVehicleTypeSet() {
    return super.getVehicleTypeSet();
  }

  @Override
  public void setVehicleTypeSet(VehicleTypeSet value) {
    super.setVehicleTypeSet(value);
  }

  //TODO Needs SignalSet MO
  @Override
  public SignalSet getSignalSet() {
    return super.getSignalSet();
  }

  @Override
  public void setSignalSet(SignalSet value) {
    super.setSignalSet(value);
  }

  @Override
  public SensorSet getSensorSet() {
    return (SensorSet) super.getSensorSet();
  }


  public void setSensorSet(SensorSet value) {
    super.setSensorSet(value);
  }

  @Override
  public InitialDensitySet getInitialDensitySet() {
    return (InitialDensitySet) super.getInitialDensitySet();
  }

  public void setInitialDensitySet(InitialDensitySet value) {
    super.setInitialDensitySet(value);
  }

  //TODO Needs WeavingFactorSet MO
  @Override
  public WeavingFactorSet getWeavingFactorSet() {
    return super.getWeavingFactorSet();
  }

  @Override
  public void setWeavingFactorSet(WeavingFactorSet value) {
    super.setWeavingFactorSet(value);
  }

  @Override
  public SplitRatioSet getSplitRatioSet() {
    return (SplitRatioSet) super.getSplitRatioSet();
  }


  public void setSplitRatioSet(SplitRatioSet value) {
    super.setSplitRatioSet(value);
  }

  //TODO Needs CapacitySet MO
  @Override
  public DownstreamBoundaryCapacitySet getDownstreamBoundaryCapacitySet() {
    return super.getDownstreamBoundaryCapacitySet();
  }

  @Override
  public void setDownstreamBoundaryCapacitySet(DownstreamBoundaryCapacitySet value) {
    super.setDownstreamBoundaryCapacitySet(value);
  }

  //TODO Needs EvenSet MO
  @Override
  public EventSet getEventSet() {
    return super.getEventSet();
  }

  @Override
  public void setEventSet(EventSet value) {
    super.setEventSet(value);
  }

  @Override
  public DemandSet getDemandSet() {
    return (DemandSet) super.getDemandSet();
  }


  public void setDemandSet(DemandSet value) {
    super.setDemandSet(value);
  }

  //TODO Needs ControllerSet MO
  @Override
  public ControllerSet getControllerSet() {
    return super.getControllerSet();
  }

  @Override
  public void setControllerSet(ControllerSet value) {
    super.setControllerSet(value);
  }

  @Override
  public FundamentalDiagramSet getFundamentalDiagramSet() {
    return (FundamentalDiagramSet) super.getFundamentalDiagramSet();
  }


  public void setFundamentalDiagramSet(FundamentalDiagramSet value) {
    super.setFundamentalDiagramSet(value);
  }

  @Override
  public long getProjectId() {
    return super.getProjectId();
  }

  @Override
  public void setProjectId(Long value) {
    super.setProjectId(value);
  }

  @Override
  public long getId() {
    return super.getId();
  }

  @Override
  public void setId(long value) {
    super.setId(value);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public void setName(String value) {
    super.setName(value);
  }

  @Override
  public String getSchemaVersion() {
    return super.getSchemaVersion();
  }

  @Override
  public void setSchemaVersion(String value) {
    super.setSchemaVersion(value);
  }

  public Long getSplitRatioSetId() {
    return splitRatioSetId;
  }

  public void setSplitRatioSetId(Long splitRatioSetId) {
    this.splitRatioSetId = splitRatioSetId;
  }

  public Long getDemandSetId() {
    return demandSetId;
  }

  public void setDemandSetId(Long demandSetId) {
    this.demandSetId = demandSetId;
  }

  public Long getFdSetId() {
    return fdSetId;
  }

  public void setFdSetId(Long fdSetId) {
    this.fdSetId = fdSetId;
  }

  public Long getSensorSetId() {
    return sensorSetId;
  }

  public void setSensorSetId(Long sensorSetId) {
    this.sensorSetId = sensorSetId;
  }

  public Long getRouteSetId() {
    return routeSetId;
  }

  public void setRouteSetId(Long routeSetId) {
    this.routeSetId = routeSetId;
  }

  @Override
  public boolean isLockedForEdit() {
    return super.isLockedForEdit();
  }

  @Override
  public void setLockedForEdit(Boolean value) {
    super.setLockedForEdit(value);
  }

  @Override
  public boolean isLockedForHistory() {
    return super.isLockedForHistory();
  }

  @Override
  public void setLockedForHistory(Boolean value) {
    super.setLockedForHistory(value);
  }

  /**
   * Function to validate model object Scenario. Should call the isValid method
   * of each Set, Network, etc, it contains.
   *
   * @return True if scenario is valid
   */
  public Boolean isValid() {
    // TODO: Implement, return true for now.
    return true;
  }
}
