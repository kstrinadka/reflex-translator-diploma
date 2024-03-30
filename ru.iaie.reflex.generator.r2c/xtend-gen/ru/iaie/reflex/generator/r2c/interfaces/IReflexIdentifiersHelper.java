package ru.iaie.reflex.generator.r2c.interfaces;

import ru.iaie.reflex.reflex.Const;
import ru.iaie.reflex.reflex.EnumMember;
import ru.iaie.reflex.reflex.GlobalVariable;
import ru.iaie.reflex.reflex.IdReference;
import ru.iaie.reflex.reflex.Port;
import ru.iaie.reflex.reflex.ProcessVariable;

@SuppressWarnings("all")
public interface IReflexIdentifiersHelper {
  String getProcessFuncId(final ru.iaie.reflex.reflex.Process proc);

  String getProcessVariableId(final ru.iaie.reflex.reflex.Process proc, final ProcessVariable v);

  String getConstantId(final Const c);

  String getPortId(final Port p);

  String getEnumId(final ru.iaie.reflex.reflex.Enum en);

  String getEnumMemberId(final EnumMember em);

  String getGlobalVariableId(final GlobalVariable v);

  String getMapping(final IdReference original);
}
